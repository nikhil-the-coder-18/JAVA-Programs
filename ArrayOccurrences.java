import java.util.Scanner;
public class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Elements: ");
        int no = sc.nextInt();

        int arr[] = new int[no];

        for(int i=0; i<no; i++) {
            System.out.print("Enter value for Element ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the Number to find Occurrence: ");
        int no_occ = sc.nextInt();

        int occ = Occurrences(arr, no_occ);

        System.out.println("\nYour Number is Occurrences " + occ + " times in this Array.");
    }

    public static int Occurrences(int[] arr,int no) {
        int occ = 0;
        for(int i=0; i<arr.length; i++) {
            if(no == arr[i]) {
                occ++;
            }
        }
        return occ;
    }
}
