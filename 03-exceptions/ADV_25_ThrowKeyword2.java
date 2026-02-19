// WAP to show the use of Throw Keyword in java 2.
// Author : Nikhil

public class ADV_25_ThrowKeyword2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if (b == 0) {
            throw new ArithmeticException("Cannot devide by zero!");
        }

        System.out.println(a/b);

    }
}
