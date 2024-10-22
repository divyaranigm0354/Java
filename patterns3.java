import java.util.Scanner;

public class patterns3{
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
        for (int row = 0; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
                System.out.print(" ");
            }
            System.out.println();
        }



    }

}

