// Write a program to check if a given number is even or odd using 
// bitwise operators.

import java.util.Scanner;
public class BitwiseEvenOdd {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.print("Enter Any Number : ");
        int no = input.nextInt();

        if(no<0) {
            System.out.println("Negative Numbers Not Allowed !!!");
        } else if ((no | 2)%2 == 0) {
            System.out.println("Even Number...");
        } else {
            System.out.println("Odd Number...");
        }
    }
}