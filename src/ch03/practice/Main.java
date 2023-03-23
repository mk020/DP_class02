package ch03.practice;

public class Main {
  public static void main(String[] args) {

    AbstractDisplay a;

    a = new CharDisplay('a');
    a.open();
    a.print();
    a.close();

    a.display();

    a = new StringDisplay("유민경");
    a.open();
    a.print();
    a.close();

    a.display();
  }
}
