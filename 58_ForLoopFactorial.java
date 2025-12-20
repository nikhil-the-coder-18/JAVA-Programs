import java.util.Scanner;
public class ForLoopFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");;
        int number = input.nextInt();

        int fact = 1;
        for(int i=1; i<=number; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}