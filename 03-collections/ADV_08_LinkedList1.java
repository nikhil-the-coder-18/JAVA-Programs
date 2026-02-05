// WAP to show the use of LinkedList in java - 1.
// Author : Nikhil


import java.util.*;
import java.util.LinkedList;

public class ADV_08_LinkedList1 {
    public static void main(String[] args) {
        // Way 1 : ArrayList
        ArrayList<String> ar = new ArrayList<>();

        ar.add("Nikhil");
        ar.add("Zeeshan");
        ar.add("Prem");

        System.out.println(ar.get(1));

        // Way 2 : Linked List
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(18);
        ll.add(45);
        ll.add(7);

        System.out.println(ll);
    }
}
