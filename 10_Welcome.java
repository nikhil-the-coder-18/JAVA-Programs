import java.util.Scanner;
public class Welcome {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Name : ");
    String name = input.nextLine();

    System.out.println("Hello " + name + ", Welcome to the world of JAVA !");
    }
}