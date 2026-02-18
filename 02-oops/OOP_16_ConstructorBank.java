// WAP to show bank details using Constructor and method.
// Date: 03/01/2025
// Author: Nikhil

class Bank {
    int AccNo;
    String name;
    int Balance;

    Bank(int no, String n, int b) {
        this.AccNo = no;
        this.name = n;
        this.Balance = b;
    }

    public void ShowDetails() {
        System.out.println();
        System.out.println("Details::  ");
        System.out.println("User Name: " + this.name);
        System.out.println("User Account Number: " + this.AccNo);
        System.out.println("User Total balance: " + this.Balance);
    }
}

public class OOP_16_ConstructorBank {
    public static void main(String[] args) {

        Bank user1 = new Bank(8511166, "Nikhil", 202002);
        user1.ShowDetails();

        Bank user2 = new Bank(7802992, "Jayesh", 5000);
        user2.ShowDetails();

        Bank user3 = new Bank(9726340, "Bhavy", 18232);
        user3.ShowDetails();

    }
}
