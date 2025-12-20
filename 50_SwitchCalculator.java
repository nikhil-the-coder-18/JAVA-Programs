import java.util.Scanner;
public class SwitchCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.print("Enter First Number: ");
        int no1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int no2 = input.nextInt();

        System.out.println("\nSelect Operation: ");
        System.out.println("+, -, *, /");
        char choice = input.next().charAt(0);

        switch (choice) {
            case '+' :
                System.out.println("Addition: " + (no1 + no2));
                break;
            case '-' :
                System.out.println("Subtraction: " + (no1 - no2));
                break;
            case '*' :
                System.out.println("Multiplication: " + (no1 * no2));
                break;
            case '/' :
                System.out.println("Division: " + (no1 / no2));
                break;
            default : System.out.println("Invalid Choice");
        }
    }
}