import java.util.Scanner;

public class patterns7{
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

        for (int row = 0; row<n; row++) {

            //space
            for (int col = 0; col<row; col++) {
                System.out.print(" ");

            }
            //star
            for (int col = 0; col <n-2*row; col++) {
                System.out.print("*");

            }
            //space
            for (int col = 0; col <row; col++) {
                System.out.print(" ");

            }




            System.out.println();
        }



    }

}

