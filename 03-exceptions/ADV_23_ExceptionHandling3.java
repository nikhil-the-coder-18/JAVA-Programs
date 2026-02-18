// WAP to show the use of Exception Handling in java - 3 (Array Error).
// Author : Nikhil

public class ADV_23_ExceptionHandling3 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30};

        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Invalid Array Index : " + e);
        }

        System.out.println("Program continues");
    }
}
