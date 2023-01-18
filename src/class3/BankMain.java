package class3;

public class BankMain {
    public static void main(String[] args) {
//        BankUser bankUser = new BankUser("sai","pidikiti", "sai@gmail.com", 1000.00);


//        System.out.println(bankUser.getFirstName());
//        System.out.println(bankUser.getLastName());
//        System.out.println(bankUser.getEmail());
//        System.out.println(bankUser.getBalance());
//
//        bankUser.setFirstName("sai krishna");
//        System.out.println(bankUser.getFirstName());

//        BankUser bankUser1 = new BankUser();
//        System.out.println(bankUser1.getFirstName());
//        bankUser1.setFirstName("Venkata Naga");
//        System.out.println(bankUser1.getFirstName());
//        System.out.println(bankUser1.getLastName());
//        System.out.println(bankUser1.getEmail());
//        System.out.println(bankUser1.getBalance());

//        BankUser sai = new BankUser("Venkata Naga Sai","Pidikiti", "saikrishna@gmail.com", 2000.00);
//        System.out.println(sai.getBalance());
//        BankTransactions bankTransactions = new BankTransactions();
//        sai = bankTransactions.deposit(sai, 3000.0);
//        System.out.println(sai.getBalance());
//        sai = bankTransactions.withDraw(sai, 3000.0);
//        System.out.println(sai.getBalance());
//        sai = bankTransactions.withDraw(sai, 3000.0);
//        System.out.println(sai.getBalance());

        BankTransactions bankTransactions = new BankTransactions();
        BankUser newUser = bankTransactions.createNewUser("vivek","yeng", "vivek@gmail.com", 500.00);
        System.out.println(newUser.getBalance());

        BankUser otherUser = bankTransactions.createNewUser("other", "other","other", 100.00);


    }
}
