import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements you want to enter ? : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter Value for Element " + (i+1) + ": " );
            arr[i] = input.nextInt();
        }

        int min = Min(arr);

        System.out.println("\nMinimum Number From Your Array is: " + min);
    }

    public static int Min(int arr[]) {
        int min =  arr[0];
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
