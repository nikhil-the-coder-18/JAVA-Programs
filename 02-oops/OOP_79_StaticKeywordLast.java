// WAP to show the Static Keyword last program in java.
// Author : Nikhil

class School {
    static String notice = "Holiday Tommorrow";

    static void showNotice() {
        System.out.println(notice);
    }
}

public class OOP_79_StaticKeywordLast {
    public static void main(String[] args) {
        School.showNotice();
        School.showNotice();
    }
}
