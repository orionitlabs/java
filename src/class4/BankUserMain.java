package class4;

public class BankUserMain {
    public static void main(String[] args) {
        BankOfAmericaUser bankOfAmericaUser = new BankOfAmericaUser();
        bankOfAmericaUser.setFirstName("sai");
        bankOfAmericaUser.setLastName("pidikiti");
        bankOfAmericaUser.setEmail("sai@gmail.com");
        bankOfAmericaUser.setBalance(100.00);
        bankOfAmericaUser.setBofaAccountNumber("123456789");

        ChaseUser chaseUser = new ChaseUser();
        chaseUser.setFirstName("sai");
        chaseUser.setLastName("pidikiti");
        chaseUser.setEmail("sai@gmail.com");
        chaseUser.setBalance(700.00);
        chaseUser.setChaseAccountNumber("123456789");

        bankOfAmericaUser.setBalance(bankOfAmericaUser.deposit(600, bankOfAmericaUser.getBalance()));
        System.out.println(bankOfAmericaUser.getBalance());
        bankOfAmericaUser.setBalance(bankOfAmericaUser.withDraw(300, bankOfAmericaUser.getBalance()));
        System.out.println(bankOfAmericaUser.getBalance());
        chaseUser.withDraw(300, chaseUser.getBalance());
        System.out.println(bankOfAmericaUser.getBalance());
    }
}
