// WAP to show the concept of Wrapper Class in java.
// Author : Nikhil

public class OOP_74_WrapperClass {
    public static void main(String[] args) {
        int a = 5; // Primitive
        Integer num = a; // Wrapper Object (Autoboxing)
        int b = num; // Auto Unboxing
        int c = 10;
        System.out.println(b + c);
    }
}
