import java.util.Scanner;
public class Addition {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Sum Of Two Numbers !");

        System.out.print("Enter First Number : ");
        int no1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int no2 = input.nextInt();
        int sum = no1 + no2;

        System.out.println("Your Addition is = " + sum);
    }
}