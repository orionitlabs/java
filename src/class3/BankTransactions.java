package class3;

public class BankTransactions {

    public BankUser deposit(BankUser bankUser, double amountToDeposit){
        double balance = bankUser.getBalance();
        balance = balance + amountToDeposit;
        bankUser.setBalance(balance);
        return bankUser;
    }

    public BankUser withDraw(BankUser bankUser, double amountToWithDraw){
        double balance = bankUser.getBalance();
        if(balance - amountToWithDraw < 0.0){
            System.out.println("No enough funds");
            return bankUser;
        }else{
            balance = balance - amountToWithDraw;
            bankUser.setBalance(balance);
            return bankUser;
        }
    }



    public BankUser createNewUser(String firstName, String lastName, String email, double bal){
        return new BankUser(firstName, lastName, email, bal);
    }
}
