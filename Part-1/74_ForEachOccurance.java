import java.sql.SQLOutput;
import java.util.Scanner;
public class ForEachOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements you want to enter ? : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter Value for Element " + (i+1) + ": " );
            arr[i] = input.nextInt();
        }

        System.out.print("Enter Element You Want to Search: ");
        int key = input.nextInt();

        int occ = Occurance(arr, key);

        System.out.println("\n Your Element is " + occ + " times in this array.");
    }

    public static int Occurance(int arr[], int key) {
        int occ = 0;
        for(int value : arr) {
            if(key == value) {
                occ++;
            }
        }
        return occ;
    }
}
