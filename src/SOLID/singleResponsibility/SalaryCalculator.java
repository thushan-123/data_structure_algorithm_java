package SOLID.singleResponsibility;

// create a separate class for calculate salary
public class SalaryCalculator {
    public double calculateSalary(Employee employee){
        return employee.salary * 1.2;
    }
}
