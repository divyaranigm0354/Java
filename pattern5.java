import java.util.Scanner;

public class pattern5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int t = input.nextInt();

        for(int i=0;i<t;i++){
            int n = input.nextInt();
            printstars(n);

        }

    }
    static void printstars(int n){
        //int count=0;
        for (int row = 0; row<=n; row++) {
            for (int col = row; col <=n; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }



    }

}

