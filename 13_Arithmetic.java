import java.util.Scanner;
public class Arithmetic {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arithmetic Calculator !");

        System.out.print("Enter First Number : ");
        int no1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int no2 = input.nextInt();

        System.out.println("Your Addition is = " + (no1 + no2));
        System.out.println("Your Subtraction is = " + (no1 - no2));
        System.out.println("Your Multiplication is = " + (no1 * no2));
        System.out.println("Your Division is = " + (no1 / no2));
        System.out.println("Your Modulo (Remainder) is = " + (no1 % no2));
    }
}