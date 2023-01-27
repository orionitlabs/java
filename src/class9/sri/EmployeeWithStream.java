package class9.sri;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class EmployeeWithStream {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("SriHarsha", "Male", 6000);
        Employee employee2 = new Employee("alyson", "Female", 5000);
        Employee employee3 = new Employee("Parker", "Male", 2500);
        Employee employee4 = new Employee("Lisa", "Female", 10000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println("Employees List :\n");
        //forEach() is a consumer function which takes an input and returns nothing.
        employees.stream().forEach(employee -> System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary()));

        System.out.println("\nEmployees List sorted using names :\n");
        employees.stream().sorted(Comparator.comparing(o -> o.getName().toLowerCase(Locale.ROOT)))
                .forEach(employee -> System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary()));

        System.out.println("\nEmployees List having salary more than 5000 :\n");
        //filter() is a predicate function which takes an input and returns a boolean value.
        employees.stream().filter(employee -> employee.getSalary() > 5000)
                .forEach(employee -> System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary()));
    }
}
