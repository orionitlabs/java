package class4;

public class ChaseUser extends BankUser{

    private String chaseAccountNumber;

    public String getChaseAccountNumber() {
        return chaseAccountNumber;
    }

    public void setChaseAccountNumber(String chaseAccountNumber) {
        this.chaseAccountNumber = chaseAccountNumber;
    }

    @Override
    public Double withDraw(double amount, double balance) {
        if(balance -amount> 500){
            return balance - amount;
        }else {
            System.out.println("Withdraw not possible");
            return balance;
        }
    }
}
