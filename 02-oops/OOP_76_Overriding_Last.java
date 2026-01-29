// WAP to show the Overriding (run time) last program in java.
// Author : Nikhil

class Human {
    public void aMan() {
        System.out.println("i'm Father and i'm at home now !");
    }
}

class Person1 extends Human {
    @Override
    public void aMan() {
        System.out.println("i'm Employee and i'm at company now !");
    }
}

public class OOP_76_Overriding_Last {
    public static void main(String[] args) {
        Human h = new Person1();

        h.aMan();
    }
}
