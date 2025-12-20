import java.util.Arrays;
public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {10, 50, 10};

        boolean isPalindrome = IsPalindrome(arr);

        if(isPalindrome) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not Palindrome");
        }
    }

    public static boolean IsPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}