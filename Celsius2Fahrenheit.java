import java.util.Scanner;
public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter Your Celsius: ");
        double c = ip.nextDouble();

        double Result = Fahrenheit(c);

        System.out.println("Your Celsius to Fahrenheit is: " + Result);

    }

    public static double Fahrenheit (double Cel) {
        double f = (Cel * 9/5) + 32;
        return f;
    }
}
