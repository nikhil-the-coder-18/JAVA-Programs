import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            System.out.print("Enter Value for Element " + (i+1) + ": " );
            arr[i] = input.nextInt();
        }

        for(int i=0; i<5; i++) {
            System.out.println("Element " + (i+1) + " is: " + arr[i]);
        }
    }
}
