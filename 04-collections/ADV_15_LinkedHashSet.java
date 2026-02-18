// WAP to show the use of Sets in java.
// Author : Nikhil

import java.util.*;

public class ADV_15_LinkedHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(103);
        list.add(102);
        list.add(103); // duplicate
        list.add(101);
        System.out.println(list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        // it removes duplicate automatically and remembers order you added items.

        System.out.println(set);
    }
}
