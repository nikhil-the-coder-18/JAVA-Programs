// WAP to show the use of Sets in java.
// Author : Nikhil

import java.util.*;

public class ADV_13_Sets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(2); // duplicate
        set.add(3);

        // it removes duplicate automatically but ingores order

        System.out.println(set);
    }
}
