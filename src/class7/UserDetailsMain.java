package class7;

import java.util.List;

public class UserDetailsMain {
    public static void main(String[] args) {
        FilterMethodUsingFor filterMethodUsingFor = new FilterMethodUsingFor();
        FilterMethodsUsingStream filterMethodsUsingStream = new FilterMethodsUsingStream();

        List<UserDetails> userDetailsList = filterMethodUsingFor.generateUserDetails(100);
        filterMethodUsingFor.printUserDetails(userDetailsList);

        List<UserDetails> usersAgeUnder30 = filterMethodUsingFor.getUserUnderAgeOf30(userDetailsList);
        //filterMethodUsingFor.printUserDetails(usersAgeUnder30);
        filterMethodsUsingStream.printUserDetails(filterMethodsUsingStream.getUserUnderAgeOf30(userDetailsList));

        List<UserDetails> usersBankBalanceLessThan750 =filterMethodUsingFor.getUserUnderWithBankBalanceLessThan750(userDetailsList) ;
        //filterMethodUsingFor.printUserDetails(usersBankBalanceLessThan750);
        filterMethodsUsingStream.printUserDetails(filterMethodsUsingStream.getUserBankBalanceLessThan750(userDetailsList));
    }
}
