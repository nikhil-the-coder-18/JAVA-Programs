import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
    public static int[] mergeArrays (int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        for(int i=0; i< arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for(int i=0; i< arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        Arrays.sort(merged);

        return merged;
    }
}