package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_MinKyeongYu extends Product {
  
  private String modelName;

  public Car_MinKyeongYu(String modelName) {
    this.modelName = modelName;
  }

  @Override
  public void use() {
    System.out.println("모델명 "+modelName+"인 Car를 사용합니다");
  }

  @Override
  public String getModelName() {
    return modelName;
  }
}
