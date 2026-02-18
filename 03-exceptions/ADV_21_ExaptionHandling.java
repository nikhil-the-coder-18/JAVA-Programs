// WAP to show the use of Exception Handling in java.
// Author : Nikhil

public class ADV_21_ExaptionHandling {
    public static void main(String[] args) {
        System.out.println("Program Starts Here");

        try {
            int a = 10;
            int b = 0;
            int result = a/b;

            System.out.println(result);
        } catch (Exception e) {
            System.out.println("You cannot devide anything by 0");
        } finally {
            System.out.println("Program ends here");
        }
    }
}
