// December 2025 Mini Console Project #1
// Number Guessing Game
// Author: Nikhil Parmar

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // This Genarates a Random number Between 1-100
        Random rand = new Random();
        int random = rand.nextInt(100) + 1;

        System.out.println("===========================");
        System.out.println("====NUMBER GUESSING GAME===");
        System.out.println("===========================");

        System.out.println("\n- Random Number was Genarated by Computer Between 1-100 ....");
        System.out.println("- You have to guess the Number....");
        System.out.println("- Player with low attempt is the winner....");

        // This will call the Function and passes the random number there.
        Guess(random);
    }

    public static void Guess(int random) {
        Scanner ip = new Scanner(System.in);

        int attempt = 0;
        int guess;


        // This loop will run until the user guess right number.
        do {
            System.out.print("\nGuess The Number: ");
            guess = ip.nextInt();

            if(guess < random) {
                System.out.println("Hint : Higher Number than your guess!");
            } else {
                System.out.println("Hint : Lower Number than your guess!");
            }
            
            attempt++;  // it Increases attempt count
        } while(guess != random); // it stops loop when the user guess it right.


        System.out.println("\nCongrats You Guessed Right Number !!! " + guess);
        System.out.println("Your total Attempt is: " + attempt);
        System.out.println("\n\t ~ Made By Nikhil.....\n");
        System.out.println("===========================");
    }
}
