package class4;

public class BankUser {

    private String firstName;
    private String lastName;
    private String email;
    private double balance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Double deposit(double amount, double balance){
        return amount+balance;
    };

    public Double deposit(double amount, double balance, double someOtherExtra){
        return amount+balance+someOtherExtra;
    }

    public Double withDraw(double amount, double balance){
        return amount-balance;
    };
}
