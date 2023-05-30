package hw.ch14;

public class Main {
    public static void main(String[] args) {
        Support support = new PrimeNumberSupport("유민경");
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 사슬 형성 
        support.setNext(alice).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred); // 연쇄적 호출
        // alice.setNext(fred).setNext(diana).setNext(charlie).setNext(bob).setNext(elmo); // 순서를 바꿀 수 있음

        // 다양한 트러블 발생
        for (int i = 1; i <= 100; i++) {
            support.support(new Trouble(i));
        }
    }
}
