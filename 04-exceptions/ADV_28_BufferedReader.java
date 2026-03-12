// WAP to show the use of BufferedReader in java.
// Author : Nikhil

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class ADV_28_BufferedReader {
        public static void main(String[] args) {
            try {
                // 1. The FileReader connects to the file
                FileReader file = new FileReader("diary.txt");

                // 2. The BufferedReader wraps around it to make it FAST
                BufferedReader reader = new BufferedReader(file);

                String line;

                System.out.println("--- Reading Your Diary ---");

                // 3. The Magic Loop: Read line-by-line until there are no lines left (null)
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                // 4. ALWAYS close the reader! (Closing the buffer also closes the file)
                reader.close();

            } catch (IOException e) {
                System.out.println("Error: Could not find or read the file.");
            }
        }
    }