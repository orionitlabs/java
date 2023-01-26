package class9.sri;

import java.util.List;

@FunctionalInterface
public interface FilterEmployeesOnSalary {
    public List<Employee> sortBySalary(List<Employee> filterEmployeesWithSalary);
}
