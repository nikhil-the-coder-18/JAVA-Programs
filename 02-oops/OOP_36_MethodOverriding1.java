// WAP to show use of Method Overriding 1.
// Author : Nikhil

class Bank {
    int getRate() {
       return 5;
    }
}

class SBI extends Bank{
    @Override
    int getRate() {
        return 7;
    }
}

class Axis extends Bank {
    @Override
    int getRate() {
        return 9;
    }
}

public class OOP_36_MethodOverriding1 {
    public static void main(String[] args) {
        SBI a1 = new SBI();
        Axis a2 = new Axis();

        System.out.println("SBI Rate: " + a1.getRate() + "%");
        System.out.println("Axis Rate: " + a2.getRate() + "%");
    }
}
