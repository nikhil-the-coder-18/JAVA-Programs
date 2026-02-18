// WAP to show the use of LinkedList in java - 2.
// Author : Nikhil


import java.util.*;
import java.util.LinkedList;

public class ADV_09_LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> StuRoll = new LinkedList<>();
        LinkedList<String> StuName = new LinkedList<>();

        StuRoll.add(1);
        StuName.add("Nikhil");

        StuRoll.add(2);
        StuName.add("Prem");

        StuRoll.add(3);
        StuName.add("Tushar");

        StuRoll.add(4);
        StuName.add("Zeeshan");

        for(int i=0; i<StuRoll.size(); i++) {
            System.out.println("Student RollNo.:" + StuRoll.get(i));
            System.out.println("Student RollNo.:" + StuName.get(i));
            System.out.println();
        }
    }
}
