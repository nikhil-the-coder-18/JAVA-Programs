import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Percentage Calculator !!\n");
        System.out.print("Enter Your Total Marks or 6 Subject : ");
        double total = input.nextDouble();

        double percentage = calculatpercentage(total);
        System.out.println("\nYour Percentage is : " + percentage + "%");
    }

    public static double calculatpercentage(double totmarks) {
        return totmarks / 6;
    }
}