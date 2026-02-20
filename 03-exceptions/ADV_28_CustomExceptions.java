// WAP to show the use of custom exceptions in java.
// Author : Nikhil

import java.util.Scanner;

class InvalidVoterException extends Exception {
    InvalidVoterException (String message) {
        super(message);
    }
}

public class ADV_28_CustomExceptions {

    static void checkEligibility (int age) throws InvalidVoterException {
        if (age < 18)  {
            throw new InvalidVoterException("You can't vote before 18 years");
        } else {
            System.out.println("Please cast your vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
        } catch (InvalidVoterException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}