// WAP to show the use of LinkedList in java - 3.
// Author : Nikhil



import java.util.*;
import java.util.LinkedList;

public class ADV_10_LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Alice");
        list.add("Bob");

        list.add(1, "Charli");
        // If this list has 1 million names, Linked List would do step 3 instantly. ArrayList would struggle.

        System.out.println(list);
    }
}
