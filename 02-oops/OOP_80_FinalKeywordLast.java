// WAP to show the Final Keyword last program in java.
// Author : Nikhil

class Bank {
    final int accountNo = 213443;
    String name = "SBI";
}

public class OOP_80_FinalKeywordLast {
    public static void main(String[] args) {
        Bank b = new Bank();

        // b.accountNo = 2113 // Not allowed

        System.out.println("bank Name : " + b.name);
        System.out.println("Acc No: " + b.accountNo);
    }
}
