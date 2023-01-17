package class2;

public class ControlStatementMethods {

    public int withdraw(int withdrawAmount, int balance){
        int balanceAmount = 0;
        if(balance - withdrawAmount >= 100){
            balanceAmount = balance - withdrawAmount;
        }else if(balance - withdrawAmount > 50){
            balanceAmount = balance - withdrawAmount;
        }else if(balance - withdrawAmount > 10){
            balanceAmount = balance - withdrawAmount;
        }else{
            balanceAmount = balance - withdrawAmount;
        }
        return balanceAmount;
    }

    public String months(String givenMonth){
        String month;
        if(givenMonth.equalsIgnoreCase("jan")){
            month = "January";
        }else if (givenMonth.equalsIgnoreCase("feb")) {
            month = "February";
        }else if (givenMonth.equalsIgnoreCase("mar")) {
            month = "March";
        }else if (givenMonth.equalsIgnoreCase("apr")) {
            month = "April";
        }else{
            month ="Non Known";
        }
        return month;
    }

    public String monthsSwitch(int givenMonth){
        String month="";
       switch (givenMonth){
           case 1:
               month = "Jan";
               break;
           case 2:
               month = "Feb";
               break;
           case 3:
               month = "Mar";
               break;
           case 4:
               month = "Apr";
               break;
           default:
               month = "Unknown";
               break;
       }
       return month;
    }

    public String nestedIf(int value){
        if(value > 1000){
            return "Greater than 1000";
        }else{
            if(value < 500){
                return "Less than 500";
            }else {
                if(value > 750){
                    return "Less than 750";
                }else{
                    return "equal 750";
                }
            }
        }
    }

    public void decrementMethod(int value){
        for(int i = value; i>=0; i--){
            if(i == 10){
                System.out.println("value is 10");
                break;
            }
            System.out.println(i);
        }
    }

    public void decrementMethodContinue(int value){
        for(int i = value; i>=0; i--){
            if(i == 10){
                System.out.println("value is 10");
                continue;
            }
            System.out.println(i);
        }
    }

    public void decrementMethodWhile(int value){
        int i = value;
        while(i>=0){
            System.out.println(i);
            i--;
        }
    }
}
