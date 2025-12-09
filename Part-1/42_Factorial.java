import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number To Print Factorial : ");
        int num = input.nextInt();
        Fact(num);
    }
    
    public static void Fact (int no) {
        int i=1, fact=1;
        if(no == 0) {
            System.out.println("Your factorial is 1");
        }
        while (i<=no) {
            fact = fact * i;
            i++;
        }
        System.out.println("Your Factorial is = " + fact);
    }
}
