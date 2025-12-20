// Write a Program to Calculate Compound Interest. 

import java.util.Scanner;
public class CompoundInterest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Compound Interst !");

        System.out.print("Enter Your Principle Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter Your Rate of Interest : ");
        double r = input.nextDouble();
        System.out.print("Enter Time in Years : ");
        double t = input.nextDouble();

        double CI = p * Math.pow((1+r/100), t);

        System.out.println("Your Compound Interest is = " + CI);
    }
}