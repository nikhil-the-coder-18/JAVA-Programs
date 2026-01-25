// WAP to show the concept of Polymorphism in interface - 3.
// Author : Nikhil

interface USBDevice {
    public void connect();
}

class Keyboard implements USBDevice {
    @Override
    public void connect() {
        System.out.println("Keyboard Device connected.");
    }
}

class Mouse implements USBDevice {
    @Override
    public void connect() {
        System.out.println("Mouse connected.");
    }
}

class Pendrive implements USBDevice {
    @Override
    public void connect() {
        System.out.println("Pendrive connected.");
    }
}

public class OOP_55_PolymorphismInterface {
    public static void main(String[] args) {
        USBDevice pc = new Keyboard();
        pc.connect();

        USBDevice pc2 = new Mouse();
        pc2.connect();

        USBDevice pc3 = new Pendrive();
        pc3.connect();
    }
}
