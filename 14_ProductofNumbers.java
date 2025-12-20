// Write a Program to get Product of two floating Number. 

import java.util.Scanner;
public class ProductofNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Product Of Two Floating Numbers !");

        System.out.print("Enter First Number : ");
        float no1 = input.nextFloat();
        System.out.print("Enter Second Number : ");
        float no2 = input.nextFloat();

        System.out.println("Your Product is = " + (no1 * no2));
    }
}