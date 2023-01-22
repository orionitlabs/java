package class7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilterMethodUsingFor {

    public List<UserDetails> getUserUnderAgeOf30(List<UserDetails> userDetails){
        List<UserDetails> usersWithAgeUnder30 = new ArrayList<>();
        for(UserDetails user : userDetails){
            if(user.getAge() < 30){
                usersWithAgeUnder30.add(user);
            }
        }
        return usersWithAgeUnder30;
    }

    public List<UserDetails> getUserUnderWithBankBalanceLessThan750(List<UserDetails> userDetails){
        List<UserDetails> usersWithBankBalanceLessThan750= new ArrayList<>();
        for(UserDetails user : userDetails){
            if(user.getBankBalance() < 750){
                usersWithBankBalanceLessThan750.add(user);
            }
        }
        return usersWithBankBalanceLessThan750;
    }


    public List<UserDetails> generateUserDetails(int size){
        List<UserDetails> userDetailsList = new ArrayList<>();
        Random random = new Random();

        for(int i=0;i<=size;i++){
            UserDetails userDetails = new UserDetails();
            userDetails.setFirstName("firstName "+i);
            userDetails.setLastName("lastName "+i);
            userDetails.setAge(random.nextInt(100)+1);
            userDetails.setBankBalance(random.nextDouble(2000)+100);
            userDetailsList.add(userDetails);
        }
        return userDetailsList;
    }

    public void printUserDetails(List<UserDetails> userDetailsList){
        for (UserDetails users: userDetailsList){
            System.out.println(users.getFirstName()+", "+users.getLastName()+", "+users.getAge()+", "+users.getBankBalance());
        }
        System.out.println("************************************************");
    }
}
