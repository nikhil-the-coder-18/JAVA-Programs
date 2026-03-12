// January Mini Console Project #2
// Bank System Level 1
// Author: Nikhil Parmar

class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit (double amount) {
        System.out.println("==============================");
        System.out.println("Account Holder Name:  " + this.accountHolderName);
        this.balance += amount;
        System.out.println("Successfully " + amount + "Rs. added to your account.");
    }

    public void withdraw (double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully " + amount + "Rs. withdrew from your account.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkBalance () {
        System.out.println("Your Current Balance is: " + this.balance + "Rs.");
        System.out.println("==============================\n");
    }
}

public class BankSystemLevel1 {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Nikhil Parmar", 5000);
        user1.deposit(6000);
        user1.withdraw(1500);
        user1.checkBalance();

        BankAccount user2 = new BankAccount("Tushar Valand", 4900);
        user1.deposit(3200);
        user1.withdraw(1400);
        user1.checkBalance();
    }
}
