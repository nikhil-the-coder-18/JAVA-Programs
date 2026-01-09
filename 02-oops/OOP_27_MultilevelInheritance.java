// WAP to show use of multilevel inheritance - 1
// Author : Nikhil

class Animal11 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends  Animal11 {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class OOP_27_MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog puppy = new BabyDog();

        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
