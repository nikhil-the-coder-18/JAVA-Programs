import java.util.Scanner;
public class IfElse {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age Please : ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You Are Eligible For Vote !");
        }
        else {
            System.out.println("You Are Not Eligible For Vote !");
        }
    }
}