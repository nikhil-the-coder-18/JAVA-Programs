// WAP to show the use of Buffered Reader in java.
// Author : Nikhil

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ADV_34_BufferedReader {
    public static void main(String[] args) {
        try {
            // The file reader connects to the file
            FileReader file = new FileReader("diary.txt");

            BufferedReader reader = new BufferedReader(file);

            String line;

            System.out.println("--- Reading Your Diary ---");

            // Reads line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Could not find or read file");
        }
    }
    
}
