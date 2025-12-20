import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {18, 45, 7, 10, 8, 33};

        int[] reverse = newArr(arr);

        System.out.println("Reversed Array is: " + Arrays.toString(reverse));
    }

    public static int[] newArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    public static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
