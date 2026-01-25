// WAP to show the concept of Encapsulation - 2.
// Author : Nikhil

class Student {
    private int marks;

    public void setMarks(int m) {
        if (m > 0 & m < 100) {
            marks += m;
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class OOP_57_Encapsulation2 {
    public static void main(String[] args) {
        Student nikhil = new Student();

        nikhil.setMarks(99);

        System.out.println("Marks : " + nikhil.getMarks());
    }
}
