import java.util.Scanner;

public class ReverseDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        int palindrome = SUM(num);
        System.out.println("Your Reverse Number is = " + palindrome);
    }

    public static int SUM (int no) {
        int reverse=0, temp;

        while (no != 0) {
            temp = no % 10;
            reverse = reverse * 10 + temp;
            no /= 10;
        }
        
        return reverse;
    }
}
