// WAP to show use of Hierarchical inheritance - 3
// Author : Nikhil

class Shape {
    int length = 32;
    int width = 34;
    int radius = 43;
    int base = 323;
    int height = 533;
}

class Rectangle extends Shape {
    void AoR() {
        System.out.println("Area of Rectangle: " + (length*width));
    }
}

class Triangle extends Shape {
    void AoR() {
        System.out.println("Area of Triangle: " + (base*height));
    }
}

class Circle extends Shape {
    void AoC() {
        System.out.println("Area of Circle: " + (radius * radius * 3.14));
    }
}

public class OOP_30_HierarchicalInheritance {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.AoR();
        Triangle t1 = new Triangle();
        t1.AoR();
        Circle c1 = new Circle();
        c1.AoC();
    }
}
