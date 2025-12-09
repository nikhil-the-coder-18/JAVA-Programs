public class WhileLoopPattern2 {
    public static void main(String[] args) {
        Pattern();
    }

    public static void Pattern() {
        int i = 1;
        while (i <= 5) {
            int j = 5;
            while (j >= i) {

                System.out.print(" *");
                j--;
            }

            System.out.println();
            i++;
        }
    }
}
