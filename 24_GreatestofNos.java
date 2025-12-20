// write a program that determines Greatest of three Numbers.

import java.util.Scanner;
public class GreatestofNos {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int no1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int no2 = input.nextInt();
        System.out.print("Enter Third Number : ");
        int no3 = input.nextInt();

        if (no1 > no2) {
            if (no1 > no3) {
                System.out.println("Big Number is = " + no1);
            }
        }
        else {
            if (no2 > no3) {
                System.out.println("Big Number is = " + no2);
            }
            else {
                System.out.println("Big Number is = " + no3);
            }
        }
    }
}