package class3.sri;

public class BankMain {
    public static void main(String[] args) {
        BankTransactions banktransactions = new BankTransactions();
        BankUser sri = banktransactions.createUser("sri", "harsha", "sri@email.com", 5000.00 );

        sri = banktransactions.deposit(sri, 1000.00);
        System.out.println("Your balance after deposit is "+sri.getBalance());

        sri = banktransactions.withdraw(sri, 5950.00);
        System.out.println("Your balance after withdraw is "+sri.getBalance());

        sri = banktransactions.withdraw(sri, 2000.00);
        System.out.println("Your balance after withdraw is "+sri.getBalance());

        sri = banktransactions.updateFirstName(sri, "SriHarsha");
        System.out.println("firstname updated successfully to "+sri.getFirstName());

        sri = banktransactions.updateLastName(sri, "Ala");
        System.out.println("lastname updated successfully to "+sri.getLastName());

        sri = banktransactions.updateEmail(sri, "harsha@gmail.com");
        System.out.println("email updated successfully to "+sri.getEmail());
    }
}
