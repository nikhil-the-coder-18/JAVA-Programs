// WAP to show the use of ArrayList in java - 4.
// Author : Nikhil

import java.util.*;

public class ADV_04_ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nikhil");
        names.add("Amit");
        names.add("Rahul");

        System.out.println("Origional List: " + names);

        System.out.println("First Name: " + names.get(0));

        names.set(1, "Rohan");
        names.remove(2);

        System.out.println("Updated List: " + names);
        System.out.println("Total Elements: " + names.size());
    }
}
