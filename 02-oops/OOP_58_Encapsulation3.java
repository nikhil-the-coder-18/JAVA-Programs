// WAP to show the concept of Encapsulation - 3.
// Author : Nikhil

class Employee {
    private int salary = 15000;

    public int getSalary() {
        return salary;
    }
}

public class OOP_58_Encapsulation3 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("Salary: " + emp.getSalary());
    }
}
