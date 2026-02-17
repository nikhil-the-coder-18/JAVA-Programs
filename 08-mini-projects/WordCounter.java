// February Mini Console Project #9
// Word Frequency Counter
// Author: Nikhil Parmar

import java.util.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter an sentence: ");
        String text = ip.nextLine();

        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int oldValue = wordCount.get(word);
                wordCount.put(word, oldValue + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("---- Word Frequency Report ----");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }
    }
}