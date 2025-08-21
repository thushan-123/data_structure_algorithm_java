package SOLID.singleResponsibility;

public class EmployeeBAD {
    String name;
    double salary;

    public void calculateSalary (){
        System.out.println("calculate salary");
    }

    public void saveToDataBase(){
        System.out.println("save to database");
    }
}

    // one class handling both of data (this class violate single responsibility)

    // separate function has separate class