// WAP to show use of Method Overriding 2.
// Author : Nikhil

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is Running");
    }
}

public class OOP_37_MethodOverriding2 {
    public static void main(String[] args) {
        Bike Honda = new Bike();

        Honda.run();
    }
}
