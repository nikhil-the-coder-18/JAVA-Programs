// WAP to show the concept of The Object Class - 2.
// Author : Nikhil

class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " costs " + price;
    }
}

public class OOP_70_ObjectClass2 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW M4", 2500000);

        System.out.println(c1);
    }
}
