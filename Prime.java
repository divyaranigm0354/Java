import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        isprime(n);
    }
     static void isprime(int n){
        for(int i=2 ;i<n;i++){
            if(n%i==0){
                System.out.println("Non prime");
                break;
            }
            else{
                System.out.println("prime");
            }
        }
     }
}
