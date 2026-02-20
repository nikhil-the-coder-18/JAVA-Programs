// WAP to show the use of custom exceptions in java - 2.
// Author : Nikhil

import java.util.Scanner;

class InvalidPasswordException extends Exception {

    InvalidPasswordException (String msg) {
        super(msg);
    }

}

public class ADV_29_CustomExceptions2 {

    static void checkPass (String pass) throws InvalidPasswordException {

        if (pass.length() < 8) {
            throw new InvalidPasswordException("Password length cannot be less than 8!");
        } else {
            System.out.println("Login Successfull!");
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String pass = sc.nextLine();

        try {

            checkPass(pass);

        } catch (InvalidPasswordException e)  {

            System.out.println("ERROR: " + e.getMessage());

        }

    }

}
