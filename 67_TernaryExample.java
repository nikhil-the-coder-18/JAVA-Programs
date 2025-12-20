import java.util.Scanner;
public class TernaryExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");;
        int no1 = input.nextInt();
        System.out.println("Enter Second Number: ");;
        int no2 = input.nextInt();

        int result = no1 < no2 ? no1 : no2;
        System.out.println("Minimum Number is = " + result);
    }
}
