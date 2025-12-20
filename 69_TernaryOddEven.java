import java.sql.SQLOutput;
import java.util.Scanner;
public class TernaryOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number: ");;
        int no = input.nextInt();

        String result = no % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your Number is " + result);
    }
}
