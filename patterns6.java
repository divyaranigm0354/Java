import java.util.Scanner;

public class patterns6{
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

            //space
            for (int col = 0; col <n-row+1; col++) {
                System.out.print(" ");

            }
            //star
            for (int col = 0; col <2*row+1; col++) {
                System.out.print("*");

            }
            //space
            for (int col = 0; col <n-row+1; col++) {
                System.out.print(" ");

            }




            System.out.println();
        }



    }

}

