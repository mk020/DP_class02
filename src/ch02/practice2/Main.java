package ch02.practice2;

public class Main {
  public static void main(String[] args) {
    
    // Banner 이용하기
    // 가정: Banner를 직접 클라이언트가 직접 사용하지 못한다.
    // 소스 코드를 얻을 수 없다.
    Banner b = new Banner("ymk");
    b.showWithParen();
    b.showWithAster();

    // 어댑터를 이용하기
    // Banner 클래스를 수정해도 클라이언트는 영향을 안 받는다.
    // Banner 클래스를 수정하지 않고도 클라이언트가 원하는 형태로 사용할 수 있다.
    Print x = new PrintBanner("ymk");
    x.printWeak();
    x.printStrong();
  }
}
