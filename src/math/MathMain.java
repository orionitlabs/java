package math;

public class MathMain {
    public static void main(String[] args) {

        //static
        int additionResult = MathFunctions.addition(10,20);
        System.out.println(additionResult);
        int subResult = MathFunctions.subtraction(10,20);
        System.out.println(subResult);

        //non-static
        MathFunctions mathFunctions = new MathFunctions();
        int multiResult = mathFunctions.multiplication(10,20);
        System.out.println(multiResult);
        float divResult = mathFunctions.division(100,20);
        System.out.println(divResult);
        mathFunctions.percent(100, 15);
    }
}
