package class9;

public class Greet {

    public void sendMessage(Greeting greeting) {
        greeting.printMessage("Hi All");
    }


    public void printMessage(String msg) {
        System.out.println("Hello Text " + msg);
    }

    String name = "Ana";
    int num = 2;
    Greeting myHelloWorld = msg -> System.out.println("Hello Text " + msg);
    Greeting myHeyGreet = msg -> System.out.println("Hey Greet " + msg);


    //Lambda Syntax
    //(Input Args) -> {Function-Behaviour}
//    (int a, int b) -> a+b;



/*
    public void sendMesssage(    public void printMessage(String msg) {
        System.out.println("Hello Text " + msg);
    }) {

    }*/



    public static void main(String args[]) {
        Greet g = new Greet();
        Greeting greeting1 = new HelloWorldGreeting();
        Greeting greeting2 = new HeyGreet();
        g.sendMessage(greeting1);
        g.sendMessage(greeting2);

        Greeting myHelloWorld = (String msg) -> System.out.println("Hello Text " + msg);
        Greeting myHeyGreet = (String msg) -> System.out.println("Hey Greet " + msg);

        g.sendMessage(myHelloWorld);
        g.sendMessage(myHeyGreet);


        System.out.println("Anonymus class");
        g.sendMessage(new Greeting() {
            @Override
            public void printMessage(String msg) {
                System.out.println("Hello Text " + msg);
            }
        });
    }
}
