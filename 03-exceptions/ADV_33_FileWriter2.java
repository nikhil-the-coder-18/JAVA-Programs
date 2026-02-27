// WAP to show the use of The File Writer in Java - 2.
// Author : Nikhil


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ADV_33_FileWriter2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your thougth for today?");
        String thought = sc.nextLine();

        try {

            FileWriter writer = new FileWriter("diary.txt");

            writer.write(thought);

            writer.close();

            System.out.println("Successfully saved it in the file!");

        } catch (IOException e) {

            System.out.println("Something went wrong!");

        }

    }
}
