package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYuMinKyeong2;

public class Main2 extends Thread {
  public static void main(String[] args) {
    System.out.println("20210787 유민경");

    new Main2("최승훈").start();
    new Main2("유민경").start();
    new Main2("김희윤").start();
  }

  @Override
  public void run() {
    IDCardFactoryYuMinKyeong2 obj = IDCardFactoryYuMinKyeong2.getInstace();
    System.out.println(getName()+": obj = "+obj);
  }

  public Main2(String name) {
    super(name);
  }
}
