public class ArrayMatrixAdd {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 4, 6},
                        {8, 0, 2}};

        int[][] arr2 = {{2, 4, 6},
                        {8, 0, 2}};

        int[][] add = {{0, 0, 0},
                       {0, 0, 0}};

        for(int i=0; i<add.length; i++) {
            for(int j=0; j<add[i].length; j++) {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i=0; i<add.length; i++) {
            for(int j=0; j<add[i].length; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
