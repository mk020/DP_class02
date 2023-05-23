package ch14.Sample;

public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳(부모 타입) - 자식 중 어떤 것이든 가리킬 수 O

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정한다
    public void support(Trouble trouble) { // 템플릿 메소드
        if (resolve(trouble)) { // 해결했으면...
            done(trouble);
        } else if (next != null) { // 뒷사람이 있으면...
            next.support(trouble); // 뒷사람한테 넘긴다
        } else { // 뒷사람이 없으면...
            fail(trouble); // 실패
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    protected abstract boolean resolve(Trouble trouble); // 자식들이 자기 방식으로 해결하도록 한다

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
