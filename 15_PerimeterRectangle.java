// Write a Program to get Perimeter of a Rectangle. 

import java.util.Scanner;
public class PerimeterRectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Perimeter of a Rectangle !");

        System.out.print("Enter Side 1 in cm : ");
        double side1 = input.nextDouble();
        System.out.print("Enter Side 2 in cm : ");
        double side2 = input.nextDouble();
        System.out.print("Enter Side 3 in cm : ");
        double side3 = input.nextDouble();
        System.out.print("Enter Side 4 in cm : ");
        double side4 = input.nextDouble();

        double result = side1 + side2 + side3 + side4;

        System.out.println("Your Perimeter of a Rectangle is = " + result);
    }
}