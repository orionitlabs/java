package class1.methods;

public class AdditionMethod {

    public static void main(String[] args) {
        int result = AdditionMethod.addition(10, 20);
        System.out.println(result);

        System.out.println(result);
        result = additionWithThreeParams(10, 20, 30);
        System.out.println(result);


        //Classname objname = new Classname();
        AdditionMethod additionMethod = new AdditionMethod();
        additionMethod.additionWithFourParams(10,20,30,40);
    }

    //static and non static

    //access modifier -- return type -- method name --(n number of param seperated by , comma)
    public static int addition(int a, int b){
        int number1 = a;
        int number2 = b;

        int result = number1+number2;
        return  result;
    }

    private static int additionWithThreeParams(int a, int b, int c){
        int number1 = a;
        int number2 = b;
        int number3 = c;

        int result = number1+number2+number3;
        return  result;
    }

    public void additionWithFourParams(int a, int b, int c, int d){
        int number1 = a;
        int number2 = b;
        int number3 = c;
        int number4 = c;

        int result = number1+number2+number3+number4;
        System.out.println(result);
    }
    //private, public, protected

    // Primitive and Non Primitive Data type
    // Integer -- Integer, int
}
