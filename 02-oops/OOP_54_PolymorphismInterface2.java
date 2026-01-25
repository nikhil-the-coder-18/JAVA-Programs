// WAP to show the concept of Polymorphism in interface - 2.
// Author : Nikhil

interface smartPhone {
    default void turnOn() {
        System.out.println("Mobile Phone Turning on...");
    }

    public void camera();
    public void gps();
}

class myCamera implements smartPhone {
    @Override
    public void camera() {
        System.out.println("Recording video in 4k...");
    }

    @Override
    public void gps() {
        System.out.println("GPS not supported in this model.");
    }
}

class myGps implements smartPhone {
    @Override
    public void gps() {
        System.out.println("Finding location...");
    }

    @Override
    public void camera() {
        System.out.println("Camera not available.");
    }
}

public class OOP_54_PolymorphismInterface2 {
    public static void main(String[] args) {
        smartPhone vivo = new myCamera();
        vivo.turnOn();
        vivo.camera();
        vivo.gps();

        smartPhone iPhone = new myGps();
        iPhone.turnOn();
        iPhone.camera();
        iPhone.gps();
    }
}
