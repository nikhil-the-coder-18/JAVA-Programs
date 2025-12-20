import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number To Print Multiplication Table : ");
        int num = input.nextInt();
        Loop(num);
    }

    public static void Loop(int no) {
        int i = 1;
        while (i <= 10) {
            System.out.println(no + " x " + i + " = " + (no * i));
            i++;
        }
    }
}