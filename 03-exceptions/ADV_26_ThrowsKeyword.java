// WAP to show the use of Throws Keyword in java.
// Author : Nikhil

import java.io.FileReader;
import java.io.IOException;

public class ADV_26_ThrowsKeyword {

    static void readFile() throws IOException {
        FileReader file = new FileReader("text.txt");
        System.out.println("File Opened Sucessfully!");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
