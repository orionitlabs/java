package class4;

public class BankOfAmericaUser extends BankUser{

    private String bofaAccountNumber;


    public String getBofaAccountNumber() {
        return bofaAccountNumber;
    }

    public void setBofaAccountNumber(String bofaAccountNumber) {
        this.bofaAccountNumber = bofaAccountNumber;
    }

    @Override
    public Double withDraw(double amount, double balance) {
        if(balance -amount> 100){
            return balance - amount;
        }else {
            System.out.println("Withdraw not possible");
            return balance;
        }
    }
}
