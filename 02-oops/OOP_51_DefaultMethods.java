// WAP to show the concept default methods in java.
// Author : Nikhil

interface Vehicle {
    void move();
    default void fuelType() {
        System.out.println("Fuel type is not specified.");
    }
}

class car implements Vehicle {
    public void move() {
        System.out.println("Car is on the highway");
    }
}

class bike implements  Vehicle {
    public void move() {
        System.out.println("Bike is moving on the road");
    }
}

public class OOP_51_DefaultMethods {
    public static void main(String[] args) {
        Vehicle v1 = new car();
        Vehicle v2 = new bike();

        v1.move();
        v1.fuelType();

        v2.move();
        v2.fuelType();
    }
}
