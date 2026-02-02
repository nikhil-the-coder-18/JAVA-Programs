// WAP to show the use of ArrayList in java - 2.
// Author : Nikhil

import java.util.*;

public class ADV_02_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(33);
        numbers.add(18);
        numbers.add(45);

        System.out.println(numbers);

        numbers.remove(0);

        System.out.println(numbers);
    }
}
