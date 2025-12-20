import java.util.Scanner;
public class BitwiseNOT {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Any Number : ");
        int no = input.nextInt();

        int result = ~no;

        System.out.println(" ~ " + no + " = " + result);
    }
}