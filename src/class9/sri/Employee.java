package class9.sri;

import java.util.*;

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
        Employee employee2 = new Employee("amrutha", "Female", 5000);
        Employee employee3 = new Employee("Pavan", "Male", 2500);
        Employee employee4 = new Employee("Yeswitha", "Female", 10000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);


        System.out.println("Employees List :\n");

        // Lambda function for printing all employee details using interface "PrintEmployees".
        PrintEmployees printingData =  printEmployees -> {
            for(Employee employee : printEmployees)
                System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary());
        };

        printingData.printAllEmployees(employees);

        System.out.println("\nEmployees List sorted using names :\n");

        // Lambda function for sorting all employees using their names using interface "SortEmployeesOnNames".
        SortEmployeesOnNames sortingData = sortEmployeesWithNames -> {

//            sortEmployeesWithNames.sort(Comparator.comparing(Employee::getName));
            sortEmployeesWithNames.sort(Comparator.comparing(o -> o.getName().toLowerCase(Locale.ROOT)));
//            sortEmployeesByName.sort((o1, o2) -> o1.getName().toLowerCase(Locale.ROOT).compareTo(o2.getName().toLowerCase(Locale.ROOT)));
            for(Employee employee : sortEmployeesWithNames)
                System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary());
        };

        sortingData.sortUsingNames(employees);

        System.out.println("\nEmployees List having salary more than 5000 :\n");

        // Lambda function for printing all employees having salary more than x using interface "FilterEmployeesOnSalary".
        FilterEmployeesOnSalary filteredData = filterEmployeesWithSalary -> {
            List<Employee> salaryFilter = new ArrayList<>();
            for(Employee employee : filterEmployeesWithSalary){
                if(employee.getSalary() > 5000)
                    salaryFilter.add(employee);
            }
            return salaryFilter;
        };

        List<Employee> salaryFilter = filteredData.sortBySalary(employees);

        for(Employee employee : salaryFilter)
            System.out.println(employee.getName()+", "+employee.getGender()+", "+employee.getSalary());

    }

}
