// WAP to show the use of ArrayList Iteration in java - 2.
// Author : Nikhil

import java.util.*;

public class ADV_07_ArrayListITERATION2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        numbers.add(50);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()) {
            Integer n = it.next();
            if(n%2==0) {
                it.remove(); // Removes Even Numbers
            }
        }

        System.out.println("Final List: " + numbers);
    }
}
