package class9;

public class HeyGreet implements Greeting {
    @Override
    public void printMessage(String msg) {
        System.out.println("Hey Greet "+msg);
    }
}
