import java.util.Scanner;
public class TernaryExample2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Your Score: ");;
            int no = input.nextInt();

            String result = no > 80 ? "High" : (no > 50 ? "Moderate" : "Low");
            System.out.println("You Scored " + result);
    }
}
