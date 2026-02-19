// WAP to show the use of Throw Keyword in java.
// Author : Nikhil

public class ADV_24_ThrowKeyword {
    public static void main(String[] args) {

        int age = 17;

        if (age <= 18) {
            throw new ArithmeticException("You are not eligible for vote!");
        }

        System.out.println("You can vote.");
    }
}
