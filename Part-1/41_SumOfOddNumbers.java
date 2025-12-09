// write a java program to sum all odd numbers from 1 to a specified number N. //

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        int sum = SUM(num);
        System.out.println("Your Sum of odd Digits is = " + sum);
    }

    public static int SUM (int no) {
        int sum=0, i=1;

        while (i <= no) {
            if((i % 2) != 0) {
                sum += i;
            }
                i++;
        }
        return sum;
    }
}
