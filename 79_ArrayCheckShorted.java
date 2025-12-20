import java.util.Scanner;
public class ArrayCheckShorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i < n; i++) {
            System.out.print("Enter Value for Element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        boolean Isshorted = IsShorted(arr);

        if(Isshorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not shorted.");
        }
    }

    public static boolean IsShorted (int arr[]) {
        for(int i=0; i<arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}