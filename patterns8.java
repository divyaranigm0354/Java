import java.util.Scanner;

public class patterns8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int t = input.nextInt();

        for(int i=0;i<t;i++){
            int n = input.nextInt();
            printstars(n);

        }

    }
    static void printstars(int n) {
        int count = 1;
        for (int i = 0; i <n; i++) {
            for (int j =1; j<=i; j++) {
                System.out.print(count);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}

