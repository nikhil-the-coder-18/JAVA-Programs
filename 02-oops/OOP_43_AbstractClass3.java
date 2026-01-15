// WAP to show use of Abstract classes - 3.
// Author : Nikhil

abstract class Animal {
    public abstract void walk();

    public void breath() {
        System.out.println("Both Animals breaths faster!");
    }
}

class Horse extends Animal {
    @Override
    public void walk() {
        System.out.println("Walks on 4 leg");
    }
}

class Chicken extends Animal {
    @Override
    public void walk() {
        System.out.println("Walks on 2 leg");
    }
}


public class OOP_43_AbstractClass3 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.breath();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();
    }
}
