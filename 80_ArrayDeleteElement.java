import java.util.Scanner;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value for Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Specific Element you want to Delete: ");
        int delete = sc.nextInt();

        int[] newArr = deleteElement(arr, delete);

        if (newArr.length == arr.length) {
            System.out.println("Element not found. Array remains same.");
        } else {
            System.out.println("New array after deleting element:");
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] deleteElement(int[] arr, int delete) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                count++;
            }
        }

        if (count == 0) {
            return arr;
        }

        int[] newArr = new int[arr.length - count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != delete) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}

