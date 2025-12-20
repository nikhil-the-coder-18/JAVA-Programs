import java.util.Scanner;

public class AbsoluteNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int number = input.nextInt();

        int absNum = CalculateAbs(number);

        System.out.println("\nYour Absolute Number is : " + absNum);
    }

    public static int CalculateAbs(int num) {
        if (num < 0) {
            return (-1) * num;
        } else {
            return num;
        }
    }
}