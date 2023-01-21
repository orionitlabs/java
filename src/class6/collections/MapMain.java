package class6.collections;

import class6.arrays.User;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<Integer, User> users = new HashMap<>();
        User user1 = new User();
        user1.setFirstName("sai");
        user1.setLastName("krishna");
        user1.setEmail("sai@gmail.com");
        users.put(1, user1);
        User user2 = new User();
        user2.setFirstName("vivek");
        user2.setLastName("test");
        user2.setEmail("vivek@gmail.com");
        users.put(1, user2);
        users.put(null, user1);

        //System.out.println(users.get(75).getFirstName()+", "+users.get(75).getLastName()+", "+users.get(75).getEmail());
        System.out.println(users.get(1).getFirstName()+", "+users.get(1).getLastName()+", "+users.get(1).getEmail());

        System.out.println(users.get(null).getFirstName()+", "+users.get(null).getLastName()+", "+users.get(null).getEmail());

        //inset put(key, value) -- to insert, size-- to get size of map, remove (key) --- to remove, get(key) -- to retrieve,

    }
}
