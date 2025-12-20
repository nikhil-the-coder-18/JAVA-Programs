import java.util.Scanner;
public class MethodSum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int a = ip.nextInt();

        int result = Sum(a);

        System.out.println("Your Sum from 1 to " + a + " is: " + result);
    }

    public static int Sum (int x) {
        int sum = 0;
        for(int i=1; i<=x; i++) {
            sum += i;
        }
        return sum;
    }
}