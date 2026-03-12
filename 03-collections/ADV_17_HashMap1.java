// WAP to show the use of Hashmap in java - 1 .
// Author : Nikhil

import java.util.*;

public class ADV_17_HashMap1 {
    public static void main(String[] args) {
        
        // Creating Hashmap
        HashMap <String, String> dic = new HashMap<>();

        dic.put("Java", "An Programming language");
        dic.put("Apple", "An fruit");
        dic.put("BMW", "A Car brand");

        System.out.println(dic.get("Python")); // Null
        System.out.println(dic.get("Java"));

        if (dic.containsKey("Java")) {
            System.out.println("Yeas it exists!");
        }
    }
}