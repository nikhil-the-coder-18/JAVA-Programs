// WAP to show the use of ArrayList in java - 5.
// Author : Nikhil

import java.util.*;

public class ADV_05_ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(18);
        numbers.add(45);
        numbers.add(7);
        numbers.add(33);
        numbers.add(10);

        int max = numbers.get(0);
        int min = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {

            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }

            if(numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.println("List: " + numbers);
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }
}
