// WAP to show the use of BufferedReader in java - 2.
// Author : Nikhil

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADV_29_BufferedReader2 {
    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter Your name: ");
        String name = br.readLine();

        System.out.println("Hello " + name + " !");
    }
}
