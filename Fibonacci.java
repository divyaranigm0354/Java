import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int n1=0;
        int n2=1;
        int nexterm;
        for(int i=0;i<n;i++){
            System.out.println(n1 + " ");
           nexterm=n1+n2;
          n1=n2;
          n2=nexterm;

        }

    }
}
