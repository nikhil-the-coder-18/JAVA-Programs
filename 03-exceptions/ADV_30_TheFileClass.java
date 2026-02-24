// WAP to show the use of The File Class in Java.
// Author : Nikhil


import java.io.File;
import java.io.IOException;

public class ADV_30_TheFileClass {
    public static void main(String[] args) {
        
        // Pointing to a file
        File myFile = new File("Nothing.txt");

        try {

            // check if exists
            if (myFile.exists()) {

                System.out.println("File already exists!");
                System.out.println("File Length: " + myFile.length() + " bytes");

            } else {

                // creates new if not exists
                myFile.createNewFile();
                System.out.println("New File created successfully!");

            }

        } catch (IOException e) {

            // in case hard drive blocks us
            System.out.println("Could not create file: " + e.getMessage());

        }
    }
}