// Create a program using continue to sum all positive numbers entered by the 
// user; skip any negative numbers.

import java.util.Scanner;
public class Continue2 {
    public static void main(String[] args) {

        Sum();
    }
    public static void Sum() {
        Scanner input = new Scanner(System.in);
        int sum=0;

        while (true) {
            System.out.print("Enter The Number (0 to Stop) : ");
            int no = input.nextInt();

            if (no == 0) {
                break;
            }

            if(no < 0) {
                continue;
            }
            sum += no;
        }
        System.out.println("Your Sum of all Digits is = " + sum);
    }
}