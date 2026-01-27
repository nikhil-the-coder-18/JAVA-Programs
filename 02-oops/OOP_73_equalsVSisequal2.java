// WAP to show the concept of .equals() vs == in java - 2.
// Author : Nikhil

class Phone {
    String model;
    Phone (String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        Phone other = (Phone) obj;
        return this.model.equals(other.model);
    }
}

public class OOP_73_equalsVSisequal2 {
    public static void main(String[] args) {
        Phone p1 = new Phone("iPhone");
        Phone p2 = new Phone("iPhone");

        System.out.println(p1 == p2); // False
        System.out.println(p1.equals(p2)); //True
    }
}
