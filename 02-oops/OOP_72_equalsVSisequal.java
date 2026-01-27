// WAP to show the concept of .equals() vs == in java - 1.
// Author : Nikhil

class Student {
    int rollNo;
    Student (int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }
}

public class OOP_72_equalsVSisequal {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(101);

        System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2)); // True
    }
}
