package class6.sri;

import java.util.ArrayList;
import java.util.List;

public class BankTransactions {
    public static List<BankUser> lowBalance(List<BankUser> bankUsers){
        List<BankUser> lowBalanceUsers = new ArrayList<>();
        for(BankUser lowBalance : bankUsers){
            if(lowBalance.getBalance() < 100.00){
                lowBalanceUsers.add(lowBalance);
            }
        }
        return lowBalanceUsers;
    }

    public static List<BankUser> ageFilter(List<BankUser> bankUsers){
        List<BankUser> ageFiltered = new ArrayList<>();
        for(BankUser lowAge : bankUsers){
            if(lowAge.getAge() < 20){
                ageFiltered.add(lowAge);
            }
        }
        return ageFiltered;
    }
}
