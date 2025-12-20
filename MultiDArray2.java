import java.util.Scanner;
public class MultiDArray2 {
    public static void main(String[] args) {

        int arr[][] = new int[3][3];

        Input(arr);
        Display(arr);
    }

    public static int[][] Input(int arr[][]) {
        Scanner ip = new Scanner(System.in);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print("Enter Element for Array position " + i + j + ": ");
                arr[i][j] = ip.nextInt();
            }
            System.out.println();
        }

        return arr;
    }

    public static int[][] Display(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }
}
