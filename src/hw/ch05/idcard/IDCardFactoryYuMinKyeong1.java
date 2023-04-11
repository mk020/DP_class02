package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYuMinKyeong1 extends Factory{

    private static IDCardFactoryYuMinKyeong1 singleton = new IDCardFactoryYuMinKyeong1();

    private IDCardFactoryYuMinKyeong1() {}

    public static IDCardFactoryYuMinKyeong1 getInstance() {
        return singleton;
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
