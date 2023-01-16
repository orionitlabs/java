package class1.math;

public class MathFunctions {

    //addition, subtraction, multiplication
    public static int addition(int a, int b){
        return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public float division(int a, int b){
        return a/b;
    }

    public void percent(int a, int b) {

        System.out.println(a%b);
        privateTest();
    }

    private void privateTest() {

        System.out.println("private");
    }
}
