import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Thee Number : ");
        int no = input.nextInt();

        int sum = sum(no);

        System.out.println("Your Sum of all Digits is = " + sum);
    }
    public static int sum (int no) {
        int sum=0;
        while (no != 0) {
            int digit = no % 10;
            sum += digit;
            no /= 10;
        }

        return sum;
    }
}