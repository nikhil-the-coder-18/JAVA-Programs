// WAP to show use of Method Overriding 3.
// Author : Nikhil

import com.sun.source.doctree.SinceTree;

class Person {
    void sing() {
        System.out.println("Someone is Singing...");
    }
}

class Arijit extends Person {
    @Override
    void sing() {
        System.out.println("Arijit is Singing...");
    }
}

public class OOP_38_MethodOverriding3 {
    public static void main(String[] args) {
        Arijit Singer = new Arijit();

        Singer.sing();
    }
}
