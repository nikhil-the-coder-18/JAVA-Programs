// WAP to show the concept of The Object Class - 3.
// Author : Nikhil

class Laptop {
    String brand;

    Laptop(String brand) {
        this.brand = brand;
    }
}

public class OOP_71_ObjectClass3 {
    public static void main(String[] args) {
        Laptop device = new Laptop("Lenovo");

        System.out.println(device.getClass().getName());

        if(device instanceof Laptop) {
            Laptop l = (Laptop) device;
            System.out.println("Laptop Brand: " + l.brand);
        }
    }
}
