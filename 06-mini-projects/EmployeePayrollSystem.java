// January Mini Console Project #3
// Employee Payroll System
// Author: Nikhil Parmar

class Employee {
    double monthlySalary;
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlysalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlysalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlysalary;
    }
}

class Intern extends Employee {
    int hoursWork;
    double hourlyRate;

    Intern(String name, int id, int hours, double rate) {
        super(name, id);
        this.hoursWork = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWork * hourlyRate;
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Zeeshan", 101, 50000);
        Employee e2 = new Intern("Prem", 102, 120, 110);

        System.out.println("Zeeshan's Monthly Salary: " + e1.calculateSalary() + "Rs.");
        System.out.println("Prem's Monthly Salary: " + e2.calculateSalary() + "Rs.");
    }
}
