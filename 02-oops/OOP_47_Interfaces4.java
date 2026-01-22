// WAP to show use of Interfaces - 4.
// Author : Nikhil

interface A {
    public void methodA();
}

interface B extends A {
    public void methodB();
}

class test implements B {
    @Override
    public void methodA() {
        System.out.println("Body of method A");
    }

    @Override
    public void methodB() {
        System.out.println("Body of method B");
    }
}

public class OOP_47_Interfaces4 {
    public static void main(String[] args) {
        test t = new test();

        t.methodA();
        t.methodB();
    }
}
