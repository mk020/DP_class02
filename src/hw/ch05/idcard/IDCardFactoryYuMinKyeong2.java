package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYuMinKyeong2 extends Factory{
  
    private static IDCardFactoryYuMinKyeong2 singleton = null;

    private IDCardFactoryYuMinKyeong2() {
      slowdown();
    }

    public static synchronized IDCardFactoryYuMinKyeong2 getInstace() {
      if (singleton == null) {
        singleton = new IDCardFactoryYuMinKyeong2();
      }
      return singleton;
    }

    private void slowdown() {
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
      }
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
