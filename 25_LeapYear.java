// write a program that determines if a given year is a leap year.

import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Year : ");
        int year = input.nextInt();

        if (year%4 == 0) {
            System.out.println("Leap Year...");
        }
        else {
            System.out.println("Not Leap Year...");
        }
    }
}