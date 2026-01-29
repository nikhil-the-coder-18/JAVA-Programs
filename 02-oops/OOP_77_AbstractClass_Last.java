// WAP to show the abstract classes last program in java.
// Author : Nikhil

abstract class Addition {
    public abstract int add(int a, int b);
}

class AddImpl extends Addition {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class OOP_77_AbstractClass_Last {
    public static void main(String[] args) {
        Addition a = new AddImpl();

        System.out.println("Addition of 5 & 7 is: " + a.add(5, 7));
    }
}
