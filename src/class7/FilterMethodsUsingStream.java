package class7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodsUsingStream {

    public List<UserDetails> getUserUnderAgeOf30(List<UserDetails> userDetails){
        return userDetails.stream().filter(user -> user.getAge()<30).collect(Collectors.toList());
    }

    public List<UserDetails> getUserBankBalanceLessThan750(List<UserDetails> userDetails){
        return userDetails.stream().filter(user -> user.getBankBalance()<750).collect(Collectors.toList());
    }

    public List<UserDetails> getFirstNameWhichContains(List<UserDetails> userDetails){
        return userDetails.stream().filter(user -> user.getFirstName().contains("1")).collect(Collectors.toList());
    }

    public void printUserDetails(List<UserDetails> userDetailsList){
        userDetailsList.stream().map((users) -> {
            System.out.println(users.getFirstName()+", "+users.getLastName()+", "+users.getAge()+", "+users.getBankBalance());
            return users;
        }).collect(Collectors.toList());
        System.out.println("************************************************");
    }

    //filter --> function return type should always be boolean type
    //map --> function return type should always be an object
    //peek --> function which doen't need a return type
}
