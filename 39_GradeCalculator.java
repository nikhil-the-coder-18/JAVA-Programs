import java.util.Scanner;

public class GradeCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your English Marks : ");
        int eng = input.nextInt();
        System.out.print("Enter Your Maths Marks : ");
        int maths = input.nextInt();
        System.out.print("Enter Your Biology Marks : ");
        int bio = input.nextInt();
        System.out.print("Enter Your Physics Marks : ");
        int phy = input.nextInt();
        System.out.print("Enter Your Chamestry Marks : ");
        int cam = input.nextInt();

        int totalmarks = eng + maths + bio + phy + cam;
        double percentage = totalmarks / 5;

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("\nYour Grade is A+");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("\nYour Grade is A");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("\nYour Grade is B+");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("\nYour Grade is B");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("\nYour Grade is C+");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("\nYour Grade is C");
        } else if (percentage >= 33 && percentage <= 39) {
            System.out.println("\nYour Grade is D");
        } else{
            System.out.println("\nYou Are Fail");
        }
    }
}