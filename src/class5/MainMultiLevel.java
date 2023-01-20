package class5;

public class MainMultiLevel {

    public static void main(String[] args) {
        Person person = new Person();

        person.setBankAccount("123");
        person.setEmployeeId("456");
        person.setEmail("sai@gmail.com");

        System.out.println(person.getEmail()+","+person.getBankAccount()+","+person.getEmployeeId());
    }
}
