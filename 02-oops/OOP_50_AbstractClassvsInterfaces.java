// WAP to show the concept abstract class and Interfaces mixed.
// Author : Nikhil

abstract class vehical {
    int speed;
    vehical(int s) {
        this.speed = s;
    }

    abstract public void move();

    public void start() {
        System.out.println("Vehical Started.");
    }
}

interface electricPowered {
    public void charge();
}

class electricCar extends vehical implements electricPowered {
    electricCar(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Car moving at speed of " + speed);
    }

    @Override
    public void charge() {
        System.out.println("Charging car....");
    }
}

public class OOP_50_AbstractClassvsInterfaces {
    public static void main(String[] args) {
        electricCar ev = new electricCar(120);

        ev.start();
        ev.move();
        ev.charge();
    }
}
