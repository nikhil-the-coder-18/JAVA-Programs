// Write a Program to get Area of Triangle. 

import java.util.Scanner;
public class AreaofTriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Area of Triangle !");

        System.out.print("Enter Base of Your Triangle : ");
        float b = input.nextFloat();
        System.out.print("Enter Height of Your Triangle : ");
        float h = input.nextFloat();

        double AOT = b * h * 0.5;

        System.out.println("Your Area of Triangle is = " + AOT);
    }
}