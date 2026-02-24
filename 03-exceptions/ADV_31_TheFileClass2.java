// WAP to show the use of The File Class in Java - 2.
// Author : Nikhil

import java.io.File;
import java.io.IOException; 
import java.util.Scanner;

public class ADV_31_TheFileClass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        File file = new File("data.txt");

    System.out.println("=== File Manage System ===");

    while (true) {

        System.out.println("1. Check File Exists");
        System.out.println("2. Create File");
        System.out.println("3. Show File Size");
        System.out.println("4. Delete File");
        System.out.println("5. Exit");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            if (file.exists()) {
                System.out.println("File already exists!");
            } else {
                System.out.println("File does not exist!");
            }

        }

        else if (choice == 2) {
            
            if (file.exists()) {
                System.out.println("File already exists!");
            } else {
                
                try {
                    file.createNewFile();
                    System.out.println("File Created Successfully!");
                } catch (IOException e) {
                    System.out.println("File creation failed!");
                }

            }

        }

        else if (choice == 3) {

            if (file.exists()) {
                System.out.println("File Size: " + file.length() + " bytes");
            } else {
                System.out.println("File not found!");
            }

        }

        else if (choice == 4) {

            if (file.exists()) {

                file.delete();
                System.out.println("File Deleted!");

            } else {
                System.out.println("Delete Failed");
            }

        }

        else if (choice == 5) {

            System.out.println("Program Exited Successfully!");
            break;

        }

        else {
            System.out.println("Invalid Choice!");
        }

    }

    }
}
