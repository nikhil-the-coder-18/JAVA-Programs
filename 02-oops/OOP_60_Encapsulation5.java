// WAP to show the concept of Encapsulation - 5.
// Author : Nikhil

class Account {
    private double balance = 72000;

    public double getBalance() {
        return balance;
    }
}

public class OOP_60_Encapsulation5 {
    public static void main(String[] args) {
        Account a1 = new Account();

        // System.out.println("Balance = " + a1.balance + "Rs."); // Not allowed

        System.out.println("Balance = " + a1.getBalance() + "RS.");
    }
}
