// WAP to show the use of Comparator in java.
// Author : Nikhil

import java.util.*;

class Student {
    int marks;
    String name;

    Student(int m, String n) {
        this.marks = m;
        this.name = n;
    }
}

public class ADV_11_COMPARATOR {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(85, "Nikhil"));
        list.add(new Student(70, "Prem"));
        list.add(new Student(90, "Zeeshan"));

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        for(Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
