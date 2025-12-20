import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String setpass = "Nikhil1321";
        String pass;

        do {
            System.out.print("Enter Your Password : ");
            pass = n.nextLine();
        } while (!pass.equals(setpass));

        System.out.println("Access Granted!");
    }
}
