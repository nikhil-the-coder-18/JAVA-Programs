// WAP to show the Overloading (compile time) last program in java.
// Author : Nikhil

class Person {
    public void Human(int salary) {
        System.out.println("I am employee");
        System.out.println("My salary is " + salary + "Rs.");
    }

    public void Human(int age, int marks) {
        System.out.println("I am student");
        System.out.println("i'm " + age + " years old");
        System.out.println("My marks is " + marks);
    }
}

public class OOP_75_Overloading_Last {
    public static void main(String[] args) {
        Person p = new Person();
        p.Human(17, 78);
        p.Human(25000);
    }
}
