package class4;

abstract class Abstraction {
    public String createUserName(String firstName, String lastName){
        return  firstName+"."+lastName;
    }

    abstract Integer subtraction(int a, int b);
    abstract Integer multiplication(int a, int b);
}
