// WAP to Create a Normal Class
// Date: 01/01/2026
// Author: Nikhil

class Student {
    String name;
    int rollNo;
    int marks;
}

public class Class_01_Creating {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Nikhil";
        s1.rollNo = 18;
        s1.marks = 93;

        System.out.println(s1.name);
    }
}
