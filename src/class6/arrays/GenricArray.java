package class6.arrays;

public class GenricArray {
    public static void main(String[] args) {
        User[] users = new User[4];
        User user1 = new User();
        user1.setFirstName("sai");
        user1.setLastName("krishna");
        user1.setEmail("sai@gmail.com");
        users[0] = user1;

        User user2 = new User();
        user2.setFirstName("Vivek");
        user2.setLastName("krishna");
        user2.setEmail("vivek@gmail.com");
        users[1] = user2;


        User user3 = new User();
        user3.setFirstName("dheeraj");
        user3.setLastName("pidikiti");
        user3.setEmail("dheraj@gmail.com");
        users[2] = user3;

        User user4 = new User();
        user4.setFirstName("snini");
        user4.setLastName("velaga");
        user4.setEmail("srini@gmail.com");
        users[3] = user4;

        User user5 = new User();
        user5.setFirstName("snini");
        user5.setLastName("velaga");
        user5.setEmail("srini@gmail.com");
        users[4] = user5;

        for (User user: users) {
            System.out.println(user.getFirstName()+", "+user.getLastName()+", "+user.getEmail());
        }
    }
}
