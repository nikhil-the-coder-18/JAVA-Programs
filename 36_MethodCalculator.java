// Write a program to create calculator in java using methods (Functions).

import java.util.Scanner;
public class MethodCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int no1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int no2 = input.nextInt();

        System.out.println("\nChoose an operation to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = input.nextInt();

        switch (choice) {
            case 1 : 
                int sum = add(no1, no2);
                System.out.println("\nSum of " + no1 + " and " + no2 + " is : " + sum);
                break;
            case 2 :
                int sub = sub(no1, no2);
                System.out.println("\nSubtraction of " + no1 + " and " + no2 + " is : " + sub);
                break;
            case 3 :
                int mult = mult(no1, no2);
                System.out.println("\nMultiplication of " + no1 + " and " + no2 + " is : " + mult);
                break;
            case 4 :
                if (no2 == 0) {
                 System.out.println("\nZero is not allowed as divisor !");
                }
                int div = div(no1, no2);
                System.out.println("\nDivision of " + no1 + " and " + no2 + " is : " + div);
                break;
            default :
                System.out.println("\nInvalid choice!");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div (int a, int b) {
        return a / b;
    }
 }
