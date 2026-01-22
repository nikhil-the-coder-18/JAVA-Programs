// WAP to show use of Interfaces - 2.
// Author : Nikhil

interface Calculator {
    public int add(int a, int b);
    public int sub(int a, int b);
}

class simpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

public class OOP_45_Interfaces2 {
    public static void main(String[] args) {
        Calculator c1 = new simpleCalculator();

        System.out.println("Addition of 5 and 7 is: " + c1.add(5, 7));
        System.out.println("Subtraction of 45 and 18 is: " + c1.sub(45, 18));
    }
}
