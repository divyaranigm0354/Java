import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        Scanner input=  new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int  n= input.nextByte();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Kadane(n,arr);


    }
    static int Kadane(int n,int[] arr ){
        int maxi=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0 ){
             sum=0;      }
        }
        System.out.println(maxi);
        return maxi;


    }
}
