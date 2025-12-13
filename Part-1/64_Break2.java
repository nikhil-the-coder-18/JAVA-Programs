// Create a program using break to read inputs from the user in a loop and break 
// the loop if a specific keyword (like "exit") is entered. 

import java.util.Scanner;
public class Break2 {
    public static void main(String[] args) {
        BreakExample();
    }
    public static void BreakExample() {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Keyword \"Exit\" to exit the loop: ");
            String keyword = input.nextLine();

            if(keyword.equalsIgnoreCase("Exit")) {
                break;
            }
        }
    }
}