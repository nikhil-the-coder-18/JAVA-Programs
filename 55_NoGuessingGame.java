import java.util.Scanner;

public class NoGuessingGame {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int no = 7;
        int guess;

        do {
            System.out.print("Guess The Number: ");
            guess = n.nextInt();

            if (guess > no) {
                System.out.println("You Guessed Higher than Number!");
            } else if (guess < no) {
                System.out.println("You Guessed Lower than Number!");
            }
        } while (guess != no);

        System.out.println(" 🎉 You Guessed Right !!!!");
    }
}
