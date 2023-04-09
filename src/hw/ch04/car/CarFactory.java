package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {
  
  private Vector<String> modelNames = new Vector<String>();

  @Override
  protected Product createProduct(String modelName) {
    return new Car_MinKyeongYu(modelName);
  }

  @Override
  protected void registerProduct(Product product) {
    modelNames.add(product.getModelName());
  }

  public void printAllModelNames() {
    System.out.println("\n<모델명 리스트>");
    
    Iterator<String> iterator = modelNames.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
