package class2;

public class Operators {
    public static void main(String[] args) {
//        int number1 = 10; //= this is an assignment where 10 is assigned to variable number1
//
//        if(number1 == 20){
//            System.out.println("This is 10");
//        }
//
//        if(number1 > 10){
//            int number2 = 20;
//            System.out.println(number1 +" "+number2);
//        }
//
//        if(number1 < 10){
//            int number2 = 50;
//            System.out.println(number1 +" "+number2);
//        }
//
//        if(number1 >= 10){
//            int number2 = 100;
//            System.out.println(number1 +" "+number2);
//        }
//
//        if(number1 <= 10){
//            int number2 = 200;
//            System.out.println(number1 +" "+number2);
//        } '?'

        String firstName = "krishna";
        if(firstName.equals("Krishna")){
            System.out.println("This is krishna");
        }

        if(firstName.toLowerCase().equals("Krishna".toLowerCase())){
            System.out.println(firstName.toLowerCase());
            System.out.println("This is krishna lower case");
        }

        if(firstName.toUpperCase().equals("Krishna".toUpperCase())){
            System.out.println(firstName.toUpperCase());
            gitSystem.out.println("This is krishna upper case");
        }

        if(firstName.equalsIgnoreCase("pidikiti")){
            System.out.println("This is krishna ignore case");
        }

//        int age = 50;
//
//        if(age < 45){
//            System.out.println("Age less that 45");
//        }else{
//            System.out.println("Age greater that 45");
//        }
    }
}
