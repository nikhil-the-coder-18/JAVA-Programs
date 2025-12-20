public class MethodAvarage {
    public static void main(String[] args) {
        int[] set = {25, 30, 35, 40};

        float avg = avarage(set);

        System.out.println("Avarage of Set is: " + avg);
    }

    public static float avarage (int set[]) {
        int sum = 0;
        for (int i=0; i<set.length; i++) {
            sum += set[i];
        }

        float avarage = sum/set.length;

        return avarage;
    } 
}
