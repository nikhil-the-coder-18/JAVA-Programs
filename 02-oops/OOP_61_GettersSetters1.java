// WAP to show the concept of Getters and setters - 1.
// Author : Nikhil

class Student1 {
    private int age;

    public void setAge(int age) {
        if (age>0 && age<100) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}

public class OOP_61_GettersSetters1 {
    public static void main(String[] args) {
        Student1 s = new Student1();

        s.setAge(17);

        System.out.println("Age: " + s.getAge());
    }
}
