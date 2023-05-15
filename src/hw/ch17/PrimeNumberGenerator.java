package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
    private Random random = new Random(); // 난수 생성기 
    private int number;                   // 현재 수 (이 관찰대상의 현재 상태)

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = 0; i < 100; i++) {
            number = random.nextInt(100)+1; // 1 ~ 100 사이의 임의의 수 => 상태 변화
            if (isPrimeNumber(number)) { // 소수인지 검사
              notifyObservers(); // 관찰자들에게 통지
            }
        }
    }

    public boolean isPrimeNumber(int num) {
      if (num==1) return false;
      for (int i=2; i<num; i++) {
        if (num%i==0) return false;
      }
      return true;
    }
}
