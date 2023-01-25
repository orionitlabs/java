package task6;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankUserArrayList {
    public static void main(String[] args) {
        List<BankUser> bankUsers = new ArrayList<>();
        Random rand = new Random();
        DecimalFormat onlyTwoDecimal = new DecimalFormat("#.00");

        for(int i=0; i<=100;i++){
            BankUser bankUser = new BankUser();
            bankUser.setFirstName("firstname user "+i);
            bankUser.setLastName("last name user "+i);
            bankUser.setEmail("email user "+i);
            bankUser.setBalance(Double.parseDouble(onlyTwoDecimal.format(Math.random() * (10000 - 0))));
            bankUser.setAge(rand.nextInt(100 - 28 + 1)+28);
            bankUsers.add(bankUser);
        }

//        for (BankUser bankUser: bankUsers) {
//            System.out.println(bankUser.getFirstName()+", "+bankUser.getLastName()+", "+bankUser.getEmail()+", "+bankUser.getBalance()+", "+bankUser.getAge());
//        }

        BankTransactions bankTransactions = new BankTransactions();
        System.out.println("Customers with balance less than $100.00 : ");
        List<BankUser> lowBalanceUsers = bankTransactions.lowBalance(bankUsers);
        for (BankUser bankUser: lowBalanceUsers) {
            System.out.println(bankUser.getFirstName()+", "+bankUser.getLastName()+", "+bankUser.getEmail()+", "+bankUser.getBalance()+", "+bankUser.getAge());
        }

        System.out.println("\nCustomers with age less than 30 : ");
        List<BankUser> ageFiltered = bankTransactions.ageFilter(bankUsers);
        for (BankUser bankUser: ageFiltered) {
            System.out.println(bankUser.getFirstName()+", "+bankUser.getLastName()+", "+bankUser.getEmail()+", "+bankUser.getBalance()+", "+bankUser.getAge());
        }

    }
}
