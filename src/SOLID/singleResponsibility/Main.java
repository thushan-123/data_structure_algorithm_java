package SOLID.singleResponsibility;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "thush";
        employee.salary = 30000.00;

        double salary = new SalaryCalculator().calculateSalary(employee);
        System.out.println("Employee: "+ employee.name + " salary: "+ salary);

        if(new SaveInDatabase().saveEmployeeInDatabase(employee)){
            System.out.println("Employee data save successfully");
        }
    }
}
