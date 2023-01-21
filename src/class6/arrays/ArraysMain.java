package class6.arrays;

public class ArraysMain {
    public static void main(String[] args) {
//        String[] names = {"sai","krishna", "pidikiti"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        names[0] = "venkata";
//        System.out.println(names[0]);
//        System.out.println(names.length);

        int[] numbers = new int[10];
//        System.out.println(numbers.length);
//        System.out.println(numbers[0]);

        numbers[5] = 5;


        for (int number:numbers) {
            System.out.println(number);
        }
    }
}
