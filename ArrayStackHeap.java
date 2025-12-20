public class ArrayStackHeap {
    public static void main(String[] args) {

        // Primitive copy (Safe)
        int a = 5;
        int b = a;

        System.out.println(a);


        // Array Reference copy (Dangerous)

        int[] arr = {10, 20, 30};

        int[] arr2 = arr;

        System.out.println("Array 2 Copied : " + arr2[0]);

        arr2[0] = 99;

        System.out.println("Array 2 Changed : " + arr2[0]);

    }
}
