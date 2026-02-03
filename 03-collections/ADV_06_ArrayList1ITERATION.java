// WAP to show the use of ArrayList Iteration in java.
// Author : Nikhil

import java.util.*;

public class ADV_06_ArrayList1ITERATION {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Way 1 : Enhanced Loop
        for(String f : fruits) {
            System.out.println(f);
        }

        // Way 2 : Iterator
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            String f = it.next();

            if (f.equals("Banana")) {
                it.remove();
            }
        }

        System.out.println("Fruits: " + fruits);
    }
}
