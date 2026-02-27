// WAP to show the use of The File Writer in Java.
// Author : Nikhil


import java.io.FileWriter;
import java.io.IOException;

public class ADV_32_FileWriter {
    public static void main(String[] args) {
        
        try {

            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Hello World");
            writer.write("\nThis is my first code");

            writer.close();

            System.out.println("Successfully wrote to the file!");

        } catch (IOException e) {

            System.out.println("Something went wrong");

            e.printStackTrace();

        }

    }
}