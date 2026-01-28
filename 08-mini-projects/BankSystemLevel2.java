// January Mini Console Project #7
// Bank System Level 2
// Author: Nikhil Parmar

class Bank {
    // 1. static keyword
    static final String BANK_NAME = "State Bank of India";

    // 2. Encapsulation
    String accountHolderName;
    private double balance;

    // Constructor
    Bank(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // getters
    public String getName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // common behavior
    public void deposit (double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        this.balance += amount;
        System.out.println("Successfully " + amount + "Rs. added to your account.");
    }

    public final void withdraw (double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully " + amount + "Rs. withdrew from your account.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkBalance () {
        System.out.println("Your Current Balance is: " + this.balance + "Rs.");
    }

    // Object class methods
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + ", Balance: " + balance;
    }
}

// Inheritance
class SavingAccount extends Bank {
    SavingAccount (String name, double balance) {
        super(name, balance);
    }

    public void addInterest() {
        double interest = getBalance() * 0.04;
        deposit(interest);
        System.out.println("Interest added: " + interest + " Rs.");
    }
}

public class BankSystemLevel2 {
    public static void main(String[] args) {
        System.out.println("Welcome to " + Bank.BANK_NAME);
        System.out.println("===============================\n");

        SavingAccount user1 = new SavingAccount("Nikhil Parmar", 5000);
        user1.deposit(2500);
        user1.withdraw(1500);
        user1.addInterest();
        user1.checkBalance();

        System.out.println(user1);
    }
}