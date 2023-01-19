package class4;

public class AbstractMain {
    public static void main(String[] args) {
        ImplementAbstract implementAbstract = new ImplementAbstract();
        System.out.println(implementAbstract.createUserName("sai", "pidikiti"));
        System.out.println(implementAbstract.addition(1 ,3));
        System.out.println(implementAbstract.subtraction(1 ,3));
        System.out.println(implementAbstract.multiplication(10 ,3));
    }
}
