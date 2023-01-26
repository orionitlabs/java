package class9.sri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    private String name;

    private String gender;

    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(){

    }

    public Employee(String name, String gender, int salary) {
        setName(name);
        setGender(gender);
        setSalary(salary);
    }

    // print All Employee
    // Sorting Employess based on Names
    // Print Employees having salary more than x

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("SriHarsha", "Male", 6000);
        Employee employee2 = new Employee("Amrutha", "Female", 5000);
        Employee employee3 = new Employee("Pavan", "Male", 2500);
        Employee employee4 = new Employee("Yeswitha", "Female", 10000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);


        PrintEmployees printingData =  printEmployees -> {
            for(Employee employee : printEmployees)
                System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary());
        };

        printingData.printAllEmployees(employees);

//        SortEmployeesOnNames sortingData = printEmployees -> {
//            List<Employee> sortedList = new ArrayList<>();
//            Collections.sort(printEmployees);
//        };

    }

}
