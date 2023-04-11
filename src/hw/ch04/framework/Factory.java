package hw.ch04.framework;

public abstract class Factory {
    // 제품 생산 시의 큰 흐름을 결정 => 템플릿 메소드
    public final Product create(String modelName) {
        Product p = createProduct(modelName);
        registerProduct(p);
        return p;
    }

    // 자식이 구체적인 생산 방법을 결정 => factory method
    //protected abstract Product createProduct(String owner); // 선언
    protected Product createProduct(String modelName) {
        // 디폴트 구현
        return null;
    }
    protected abstract void registerProduct(Product product); // 선언
    public abstract void printAllModelNames();
}
