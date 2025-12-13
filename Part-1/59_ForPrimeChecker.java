import java.util.Scanner;
public class ForPrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prime = 0;
        System.out.print("Enter The Number : ");
        int no = input.nextInt();

        for(int i = 2; i<no; i++) {
            if ((no % i) == 0) {
                prime = 1;
            }
        }

        if(prime == 0) {
            System.out.println("Your Number is Prime");
        } else {
            System.out.println("Your Number is Not Prime");
        }
    }
}
