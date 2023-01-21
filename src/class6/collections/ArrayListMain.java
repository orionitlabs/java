package class6.collections;

import class6.arrays.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArrayListMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
//        User user1 = new User();
//        user1.setFirstName("sai");
//        user1.setLastName("krishna");
//        user1.setEmail("sai@gmail.com");
//        users.add(user1);
//
//        User user2 = new User();
//        user2.setFirstName("Vivek");
//        user2.setLastName("krishna");
//        user2.setEmail("vivek@gmail.com");
//        users.add(user2);
//
//
//        user1.setFirstName("dheeraj");
//        user1.setLastName("pidikiti");
//        user1.setEmail("dheraj@gmail.com");
//        users.set(0,user1);
//
//        users.remove(0);
//
        //add -- for adding, set(index number, object) -- for updating, remove -- for deleting or removing, get(index) -- will return that value of index, size() -- return size of the list

//
//        for (User user: users) {
//            System.out.println(user.getFirstName()+", "+user.getLastName()+", "+user.getEmail());
//        }

        for(int i=0; i<=100;i++){
            User user = new User();
            user.setFirstName("firstname user "+i);
            user.setLastName("last name user "+i);
            user.setEmail("email user "+i);
            users.add(user);
        }

//        for (User user: users) {
//            System.out.println(user.getFirstName()+", "+user.getLastName()+", "+user.getEmail());
//        }

        System.out.println(users.get(75).getFirstName()+", "+users.get(75).getLastName()+", "+users.get(75).getEmail());
        System.out.println(users.size());
        users.remove(75);
        System.out.println(users.get(75).getFirstName()+", "+users.get(75).getLastName()+", "+users.get(75).getEmail());
        System.out.println(users.size());

        User user = new User();
        user.setFirstName("firstname user test");
        user.setLastName("last name user test");
        user.setEmail("email user test");
        users.add(75, user);
        System.out.println(users.get(75).getFirstName()+", "+users.get(75).getLastName()+", "+users.get(75).getEmail());
        System.out.println(users.size());





        List<Integer> integers = new ArrayList<>();
        integers.add(1);
    }
}
