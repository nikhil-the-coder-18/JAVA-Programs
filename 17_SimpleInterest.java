// Write a Program to Calculate Simple Interest. 

import java.util.Scanner;
public class SimpleInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Simple Interst !");

        System.out.print("Enter Your Principle Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter Your Rate of Interest : ");
        double r = input.nextDouble();
        System.out.print("Enter Time in Years : ");
        double t = input.nextDouble();

        double SI = (p*r*t/100);

        System.out.println("Your Simple Interest is = " + SI);
    }
}