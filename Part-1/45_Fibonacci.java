import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number To Print Fibonacci Series : ");
        int num = input.nextInt();
        FIBO(num);
    }

    public static void FIBO(int no) {
        int i = 2, no1 = 0, no2 = 1, fibo;
        System.out.print("Your fibonacci Series is = " + no1 + " " + no2 + " ");
        while (i <= no) {
            fibo = no1 + no2;
            System.out.print(fibo + " ");
            no1 = no2;
            no2 = fibo;
            ++i;
        }
    }
}
