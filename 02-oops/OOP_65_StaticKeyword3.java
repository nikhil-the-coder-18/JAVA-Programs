// WAP to show the concept of static keyword - 3.
// Author : Nikhil

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class OOP_65_StaticKeyword3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);
    }
}
