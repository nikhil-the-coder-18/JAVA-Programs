// WAP to show the use of ArrayList in java.
// Author : Nikhil

import java.util.*;

public class ADV_01_ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<String> newFriend = new ArrayList<>();

        friends.add("Nikhil");
        friends.add("Prem");
        friends.add("Tushar");
        friends.add("Zeeshan");
        newFriend.add("Zeeshan");
        newFriend.add("Nirmesh");

        System.out.println(friends);

        System.out.println(friends.get(0));
        System.out.println(friends.contains("Tushar"));

        friends.remove("Zeeshan");

        friends.addAll(2, newFriend);

        for(int i=0; i<friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }
}
