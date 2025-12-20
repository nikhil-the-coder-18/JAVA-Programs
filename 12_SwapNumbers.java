import java.util.Scanner;
public class SwapNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number For A = : ");
        int A = input.nextInt();
        System.out.print("Enter Number For B = ");
        int B = input.nextInt();
        
        int C = A;
        A = B;
        B = C;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}