// WAP to show the use of Throws Keyword in java - 2.
// Author : Nikhil

public class ADV_27_ThrowsKeyword_2 {

    static void checkNumber (int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number not allowed");
        }

        System.out.println("Number is valid");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
