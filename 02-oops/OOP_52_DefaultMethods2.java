// WAP to show the concept default methods in java - 2.
// Author : Nikhil

interface UPIPayment {
    default void pay() {
        System.out.println("Paid by UPI!");
    }
}

interface CardPayment {
    default void pay() {
        System.out.println("Paid by Card!");
    }
}

class onlineStore implements UPIPayment, CardPayment {
    public void pay() {
        System.out.println("Payment done using selected payment method.");
    }
    public void paid() {
        System.out.println("Payment done using selected payment method.");
    }
}

public class OOP_52_DefaultMethods2 {
    public static void main(String[] args) {
        onlineStore o = new onlineStore();

        o.pay();
        o.paid();
    }
}
