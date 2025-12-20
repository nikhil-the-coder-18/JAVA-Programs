import java.util.Scanner;
public class TernaryAbsolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number: ");;
        int no = input.nextInt();

        int result = no >= 0 ? no : -no;
        System.out.println("Your Number's Absolute is " + result);
    }
}
