// WAP to show the concept of Polymorphism in interface - 1.
// Author : Nikhil

interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle....");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle....");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle....");
    }
}

public class OOP_53_PolymorphismInterface1 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape R = new Rectangle();

        c.draw();
        t.draw();
        R.draw();
    }
}
