// write a program that determines if a number is odd or even.

import java.util.Scanner;
public class OddEven {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int no = input.nextInt();

        if (no%2 == 0) {
            System.out.println("Your Number is Even...");
        }
        else {
            System.out.println("Your Number is Odd...");
        }
    }
}