package hw.ch04.framework;

public abstract class Product {
    // 컴파일 오류
    // public abstract Product(String name);
    public abstract void use();
    public abstract String getModelName();
}
