// February Mini Console Project #10
// Secret Note Keeper
// Author: Nikhil Parmar


import java.io.*;
import java.util.Scanner;

// Custom exception class
class InvalidPassException extends Exception {
    public InvalidPassException (String message) {
        super(message);
    }
}

public class SecretNoteKeeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPass = "Nikhil18";

        System.out.println("=== Welcome to secret vault ===");
        System.out.print("Enter Password: ");
        String input = sc.nextLine();

        try {
            // The security check
            if (!input.equals(correctPass)) {
                throw new InvalidPassException("Intruder Alert! Incorrect Password.");
            }

            System.out.println("Access Granted.");
            System.out.println("1. Read Secrets");
            System.out.println("2. Add New Secret");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

            } else if (choice == 2) {
                System.out.print("Enter your secret: ");
                String secret = sc.nextLine();
                addSecret(secret);
            }
        } catch (InvalidPassException e) {
            // Catching the bad password
            System.out.println("! " + e.getMessage());
        } catch (IOException e) {
            // Catching any file system errors (like disk full)
            System.out.println("File System Error: " + e.getMessage());
        }
    }

    static void readSecrets() throws IOException {
        File file = new File("secrets.txt");
        if (!file.exists()) {
            System.out.println("No secrets stored yet.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("\n--- Your Secrets ---");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    static void addSecret(String text) throws IOException {
        // The 'true' turns on Append Mode!
        FileWriter fw = new FileWriter("secrets.txt", true);
        fw.write(text + "\n");
        fw.close();
        System.out.println("Secret saved securely.");
    }
}
