// WAP to show the use of Set Operations in java.
// Author : Nikhil

import java.util.*;

public class ADV_16_SetOperatiions {
    public static void main(String[] args) {

        // Creating six sets (two sets for each operation
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1); set1.add(2); set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2); set2.add(3); set2.add(4);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(1); set3.add(2); set3.add(3);

        HashSet<Integer> set4 = new HashSet<>();
        set4.add(2); set4.add(3); set4.add(4);

        HashSet<Integer> set5 = new HashSet<>();
        set5.add(1); set5.add(2); set5.add(3);

        HashSet<Integer> set6 = new HashSet<>();
        set6.add(2); set6.add(3); set6.add(4);

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        System.out.println();

        // Union : Cobines 2 sets
        set1.addAll(set2);
        System.out.println("Union : " + set1);

        // Intersection : Keeps common elements
        set3.retainAll(set4);
        System.out.println("Intersection : " + set3);

        // Difference : Removes Similar
        set5.removeAll(set6);
        System.out.println("Difference : " + set5);
    }
}
