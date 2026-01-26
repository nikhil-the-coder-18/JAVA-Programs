// WAP to show the concept of The Object Class - 1.
// Author : Nikhil

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My Name is " + name + " and i'm " + age + " years old.";
    }
}

public class OOP_69_ObjectClass1 {
    public static void main(String[] args) {
        Student s1 = new Student("Nikhil", 17);

        System.out.println(s1.toString());
    }
}