import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements you want to enter ? : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter Value for Element " + (i+1) + ": " );
            arr[i] = input.nextInt();
        }

        int max = Max(arr, n);

        System.out.println("\nMaximum Number From Your Array is: " + max);
    }

    public static int Max(int arr[], int no) {
        int max = 0;
        for(int i=0; i<no; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
