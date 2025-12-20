public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 20, 12, 45, 85, 23};
        int target = 12;

        boolean isFound = Search(arr, target);

        if(isFound) {
            System.out.println("Your Target is in array!");
        } else {
            System.out.println("Your Target is Not Found in array!");
        }
    }

    public static boolean Search (int[] arr, int target) {
        for(int i=0; i< arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
