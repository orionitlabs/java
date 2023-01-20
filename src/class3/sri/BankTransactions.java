package class3.sri;

public class BankTransactions {
    public BankUser createUser(String firstName, String lastName, String email, double balance){
        return new BankUser(firstName, lastName, email, balance);
    }

    public BankUser deposit(BankUser bankUser, double depositAmount){
        bankUser.setBalance(bankUser.getBalance() + depositAmount);
        System.out.println("deposit successful");
        return bankUser;
    }

    public BankUser withdraw(BankUser bankUser, double withdrawAmount){
        if(bankUser.getBalance() - withdrawAmount < 100.00){
            System.out.println("You should have a minimum balance of $100.00 . Please try for less amount");
            return bankUser;
        }else{
            bankUser.setBalance(bankUser.getBalance() - withdrawAmount);
            System.out.println("withdraw successful");
            return bankUser;
        }
    }

    public BankUser updateFirstName(BankUser bankUser, String firstName){
        bankUser.setFirstName(firstName);
        return bankUser;
    }

    public BankUser updateLastName(BankUser bankUser, String lastName){
        bankUser.setLastName(lastName);
        return bankUser;
    }

    public BankUser updateEmail(BankUser bankUser, String email){
        bankUser.setEmail(email);
        return bankUser;
    }
}
