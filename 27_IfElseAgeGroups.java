// Create a program that categorize a person into different age groups.
// Child-> below 13        Teen-> below 20       Adult-> below 60
// Senior-> above 60 

import java.util.Scanner;
public class IfElseAgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("Tu abhi Bachcha hai !! (Child)");
        }
        else if (age < 20 && age >= 13) {
            System.out.println("Tu thoda bada Ho Gaya Hai !!! (Teen)");
        }
        else if (age < 60 && age >= 20) {
            System.out.println("Arey 1 Tu to bahot bada ho Gaya ! (Adult)");
        }
        else {
            System.out.println("Ab To Tu yaar Budhdha HO Gya Hai..Dadaji... :D (Senior)");
        }
    }
}