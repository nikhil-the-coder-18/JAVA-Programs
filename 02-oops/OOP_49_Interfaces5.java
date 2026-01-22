// WAP to show use of Interfaces - 5.
// Author : Nikhil

interface scanner {
    public void scan();
}

interface printer {
    public void print();
}

class allInOneMachine implements scanner, printer {
    @Override
    public void scan() {
        System.out.println("Scanning Document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Document...");
    }
}

public class OOP_49_Interfaces5 {
    public static void main(String[] args) {
        allInOneMachine m1 = new allInOneMachine();

        m1.scan();
        m1.print();
    }
}
