// Write a Program to get Area of Circle 

import java.util.Scanner;
public class AreaofCircle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Your Area of Circle !");

        System.out.print("Enter Your Radius : ");
        float r = input.nextFloat();

        double AOC = 3.14 * r * r;

        System.out.println("Your Area of Circle is = " + AOC);
    }
}