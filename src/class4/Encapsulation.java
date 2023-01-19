package class4;

public class Encapsulation {
    private String firstName;
    private String lastName;
    private String userName;


    public Encapsulation(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String createUserName(){
        this.userName = this.firstName+"."+this.lastName;
        return this.userName;
    }
}
