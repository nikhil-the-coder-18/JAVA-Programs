// WAP to show the use of Exception Handling in java - 2.
// Author : Nikhil

import java.util.Scanner;

public class ADV_22_ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition Calculator Here: ");

        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the Second number: ");
            int b = sc.nextInt();

            System.out.println("Addition: " + (a+b));
        }
        catch (Exception e) {
            System.out.println("Please enter an Number!");
        }
    }
}
