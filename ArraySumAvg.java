import java.util.Scanner;
public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter Total Elements of Array: ");
        int no = n.nextInt();

        int[] arr = new int[no];

        for(int i=0; i<no; i++) {
            System.out.print("Enter Element " + (i+1) + ": ");
            arr[i] = n.nextInt();
        }

        int sum = Sum(arr);
        double avg = average(sum, arr);

        System.out.println("\nSum of Array is : " + sum);
        System.out.println("\nAverage of Array is : " + avg);
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for(int i=0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int sum, int[] arr) {
        return(double) sum / arr.length;
    }
}
