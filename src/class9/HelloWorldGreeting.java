package class9;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void printMessage(String msg) {
        System.out.println("Hello Text " + msg);
    }
}
