package class2.sri;

public class demo {
    public static void main(String[] args) {
        String s = controlStatements(100, 3);
        System.out.println(s);
    }
    public static String controlStatements(int a, int b){
        System.out.println("if Statements:");
        if(a==30){
            System.out.println("Value is 30");
        }else if(a==50){
            System.out.println("Value is 50");
        }else{
            System.out.println("Value is 100");
        }
        System.out.println("Switch Case Statements:");
        switch(b){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not Valid");
        }
        System.out.println("For Loop:");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("While Loop:");
        int j = 11;
        while(j<=20){
            System.out.println(j);
            j++;
        }
        return "Task Completed";
    }
}
