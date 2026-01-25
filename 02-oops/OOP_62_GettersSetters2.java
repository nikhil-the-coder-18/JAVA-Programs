// WAP to show the concept of Getters and setters - 2.
// Author : Nikhil

class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class OOP_62_GettersSetters2 {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Nikhil");

        System.out.println(p.getName());
    }
}
