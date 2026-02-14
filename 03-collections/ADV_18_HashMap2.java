// WAP to show the use of Hashmap in java - 2 .
// Author : Nikhil

import java.util.*;

public class ADV_18_HashMap2 {
    public static void main(String[] args) {
        
        HashMap <Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Rohan");
        studentMap.put(102, "Priya");
        studentMap.put(103, "Amit");

        System.out.println(studentMap.get(102));

        studentMap.put(102, "Vikram");

        System.out.println(studentMap.get(102));

        for(int roll : studentMap.keySet()) {
            System.out.println(roll + " : " + studentMap.get(roll));
        }
    }
}
