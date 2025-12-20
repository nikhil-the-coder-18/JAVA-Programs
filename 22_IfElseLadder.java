// write a program that determines if a number is positive, negative or zero.

import java.util.Scanner;
public class IfElseLadder {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int no = input.nextInt();

        if (no == 0) {
            System.out.println("Your Number is Zero...");
        }
        else if (no < 0) {
            System.out.println("Your Number is Negative...");
        }
        else {
            System.out.println("Your Number is Positive...");
        }
    }
}