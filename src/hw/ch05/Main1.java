package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYuMinKyeong1;

public class Main1 {
  public static void main(String[] args) {
    System.out.println("20210787 유민경");

    IDCardFactoryYuMinKyeong1 factory1 = IDCardFactoryYuMinKyeong1.getInstance();
    IDCardFactoryYuMinKyeong1 factory2 = IDCardFactoryYuMinKyeong1.getInstance();
    
    if (factory1==factory2) {
      System.out.println("factory1과 factory2는 같은 인스턴스 입니다");
    } else {
      System.out.println("factory1과 factory2는 다른 인스턴스 입니다");
    }
  }
}
