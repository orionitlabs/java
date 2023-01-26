package task7;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Integer user_age = random.nextInt(200);
        Double value = random.nextDouble(4000.00)+100.00;
    }
}

