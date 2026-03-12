// WAP to show the use of Sets in java.
// Author : Nikhil

import java.util.*;

public class ADV_14_Set2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Amit");
        list.add("Rahul"); // duplicate
        list.add("Priya");
        System.out.println(list);

        TreeSet<String> set = new TreeSet<>(list);
        // it removes duplicate automatically and short it them in currect order

        System.out.println(set);
    }
}
