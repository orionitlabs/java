package task5;

public class InterfaceMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setCourse1("Cloud Computing");
        student1.setCourse2("Ethical Hacking");
        student1.setCourse3("Adv Algo");
        System.out.println("Mandatory Courses for Student1 :");
        System.out.println(student1.getCourse1()+", "+student1.getCourse2()+", "+student1.getCourse3());

        student1.setProjectId("85493251");
        student1.setTopic("Webserver & Hacking");
        System.out.println("\nProject Details of Student1 :");
        System.out.println(student1.getProjectId()+", "+student1.getTopic());
    }
}