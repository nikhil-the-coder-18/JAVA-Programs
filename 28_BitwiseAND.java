import java.util.Scanner;
public class BitwiseAND {
    public static void main (String[] args) {
        Scanner nikhil = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int no1 = nikhil.nextInt();

        System.out.print("Enter Second Number : ");
        int no2 = nikhil.nextInt();

        int result = no1 & no2;

        System.out.println(no1 + " & " + no2 + " = " + result);
    }
}