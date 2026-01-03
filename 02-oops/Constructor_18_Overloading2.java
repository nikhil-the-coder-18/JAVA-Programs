class Calculator {
    public int add(int a) {
        return a+a;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public double add(double x, double y) {
        return x+y;
    }

    public String add(String a, String b) {
        return a+b;
    }
}

public class Constructor_18_Overloading2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.add(10, 20)); //adding two integers
        System.out.println(c1.add(10,18, 45));  //adding three integers
        System.out.println(c1.add(564.4, 4555.43)); //adding two doubles
        System.out.println(c1.add("Hello", "World")); //adding two Strings
    }
}
