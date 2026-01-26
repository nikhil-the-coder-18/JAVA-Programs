// WAP to show the concept of static keyword - 1.
// Author : Nikhil

class Student {
    String name;
    int roll;
    static String college;
}

public class OOP_63_StaticKeyword1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nikhil";
        s1.roll = 18;

        Student s2 = new Student();
        s2.name = "Prem";
        s2.roll = 21;

        Student.college = "NPCCSM";

        System.out.println("Student 1 name: " + s1.name);
        System.out.println("Student 1 roll no.: " + s1.roll);
        System.out.println("Student 1 College name: " + Student.college);

        System.out.println("\nStudent 2 name: " + s2.name);
        System.out.println("Student 2 roll no.: " + s2.roll);
        System.out.println("Student 2 College name: " + Student.college);

    }
}
