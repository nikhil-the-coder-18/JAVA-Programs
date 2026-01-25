// WAP to show the concept of Encapsulation - 1.
// Author : Nikhil

class BankAccount {
    private int balance = 5000;
    public void deposit(int n) {
        if (n>0) {
            balance += n;
            System.out.println(n + "Rs. deposited successful");
        } else {
            System.out.println("Deposit failed!");
        }
    }

    public void withdraw(int w) {
        if (w < balance) {
            balance -= w;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class OOP_56_Encapsulation1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        // System.out.println(b.balance);   // not allowed
        b.deposit(9000);

        b.withdraw(4300);
    }
}
