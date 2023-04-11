package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class Main {
  public static void main(String[] args) {
    System.out.println("<<20210787 유민경>>");

    Factory f = new CarFactory();
    Product car1 = f.create("유민경");
    Product car2 = f.create("그랜저");
    Product car3 = f.create("소나타");
    Product car4 = f.create("캐스퍼");

    car1.use();
    car2.use();
    car3.use();
    car4.use();

    f.printAllModelNames();
  }
}
