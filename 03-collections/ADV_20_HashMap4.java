// WAP to show the use of Hashmap in java - 4 .
// Author : Nikhil

import java.util.*;

public class ADV_20_HashMap4 {
    public static void main(String[] args) {
        HashMap<String, Integer> menu =  new HashMap<>();

        menu.put("Burger", 150);
        menu.put("Pizza", 300);
        menu.put("Coffee", 50);

        for (Map.Entry<String, Integer> items : menu.entrySet()) {
            System.out.println(items.getKey() + " costs $" + items.getValue());
        }
    }
}
