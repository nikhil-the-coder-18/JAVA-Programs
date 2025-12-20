// Create a program that calculates grade based on marks.
// A-> above 90%        B-> above 75%       C-> above 60%
// D-> above 30%        F-> below 30% 

import java.util.Scanner;
public class IfElseMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Total Marks Out of 600 : ");
        int marks = input.nextInt();

        float percentage = marks/6;
        
        System.out.println("Your Percentage is : " + percentage);

        if (percentage >= 90) {
            System.out.println("Your Grade = A");
        }
        else if (percentage < 90 && percentage >= 75) {
            System.out.println("Your Grade = B");
        }
        else if (percentage < 75 && percentage >= 60) {
            System.out.println("Your Grade = C");
        }
        else if (percentage < 60 && percentage >= 30) {
            System.out.println("Your Grade = D");
        }
        else {
            System.out.println("Your Grade = F");
        }
    }
}