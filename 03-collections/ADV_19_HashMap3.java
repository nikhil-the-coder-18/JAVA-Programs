// WAP to show the use of Hashmap in java - 3 .
// Author : Nikhil

import java.util.*;

public class ADV_19_HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Nikhil");
        students.put(102, "Prem");
        students.put(103, "Tushar");
        students.put(104, "Zeeshan");

        // Loop 1 : only keys
        for (int key : students.keySet()) {
            System.out.println(key);
        }

        // Loop 2 : Only Values
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Loop 3 : Both Key and Value
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No.: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}
