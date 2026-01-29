// WAP to show the Interfaces last program in java.
// Author : Nikhil

interface Animal {
    public default void breath() {
        System.out.println("Animal breaths");
    }

    public abstract void barks();
}

class Dog implements Animal {
    public void barks() {
        System.out.println("Dow sounds Bhow Bhow!");
    }
}

class Cat implements Animal {
    public void barks() {
        System.out.println("Cat sounds Mew Mew");
    }
}

public class OOP_78_InterfaceLast {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal a2 = new Cat();

        a.breath();
        a.barks();
        a2.barks();
    }
}
