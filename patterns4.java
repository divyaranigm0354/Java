import java.util.Scanner;

public class patterns4{
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
        for (int row = 1; row<n; row++) {
            for (int col = 0; col <row; col++) {
                System.out.print(row);
                System.out.print(" ");
            }
            System.out.println();
        }



    }

}

