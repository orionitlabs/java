package class4;

public class ImplementAbstract extends Abstraction{

    public Integer addition(int a, int b){
        return a+b;
    }

    @Override
    Integer subtraction(int a, int b) {
        return a-b;
    }

    @Override
    Integer multiplication(int a, int b) {
        return a*b;
    }
}
