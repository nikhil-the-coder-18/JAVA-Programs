// WAP to show the concept of final keyword.
// Author : Nikhil

final class Bank {

    // 1. Final Variable
    final int Acc_No = 1803232;

    // 2. Final Method
    final void policy() {
        System.out.println("Cheating not allowed");
    }

    public void showAccount() {
        System.out.println("Account NO.:" + Acc_No);
    }{}
}

//class Hacker extends Bank {   // Not allowed
//    void hacker() {
//        System.out.println("I HACKED IT");
//    }
//}

public class OOP_68_FinalClass {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.showAccount();
        b.policy();
    }
}
