public class BreakContinue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if(i==5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("- After Break");

       for (int j=1; j<=10; j++) {
            if(j==6) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println("- After Continue"); 
    }
}