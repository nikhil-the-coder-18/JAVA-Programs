// WAP to show the use of Exception Handling in java - 4 (Multiple Exceptions).
// Author : Nikhil

import java.util.Scanner;

public class ADV_24_MutipleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter the number: ");
            int a = sc.nextInt();

            int result = 100/a;

            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {

            System.out.println("Number Cannot devided by 0");

        } catch (Exception e) {

            System.out.println("Please enter an number.");

        }
    }
}
