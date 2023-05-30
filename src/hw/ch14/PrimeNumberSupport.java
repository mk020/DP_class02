package hw.ch14;

public class PrimeNumberSupport extends Support {

  public PrimeNumberSupport(String name) {
    super(name);
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return isPrimeNumber(trouble.getNumber());
  }

  public boolean isPrimeNumber(int number) {
    if (number==1) return false;
    for (int i=2; i<number; i++) {
      if (number%i==0) return false;
    }
    return true;
  }
}
