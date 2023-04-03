package hw.ch03;

public class Main {
  public static void main(String[] args) {
    System.out.println("20210787 유민경");
    
    AbstractDisplay a;

    a = new YuMinKyeongDisplay("유민경", "20210787", 3);
    
    a.display(10);
    a.display(5);
  }
}