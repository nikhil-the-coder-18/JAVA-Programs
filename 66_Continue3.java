import java.util.Scanner;
public class Continue3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int no = input.nextInt();
        PrintEven(no);
    }
    public static void PrintEven(int no) {
        for(int i=1; i<=no; i++) {
            if(i%2==1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
