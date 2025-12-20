import java.util.Scanner;
public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int no1 = input.nextInt();

        System.out.print("Enter Second Number : ");
        int no2 = input.nextInt();

        int result = no1>>no2;

        System.out.println(no1 + " >> " + no2 + " = " + result);
    }
}