package class6.collections;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Integer age = random.nextInt(100);
        Double value = random.nextDouble(2000.00)+500.00;
    }
}
