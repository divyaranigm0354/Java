import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr number of elements");
        int n= input.nextInt();
        System.out.println("Enter the elements:");
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        stock(n,arr);
    }

    static int stock(int n, int[] arr){
        int maxiprofit=0;
        int mini=arr[0];
        for(int i=0;i< arr.length;i++){
            int cost= arr[i]-mini;
            maxiprofit=max(maxiprofit,cost);
            mini=min(mini,arr[i]);
        }
        System.out.println(maxiprofit);
        return maxiprofit;
    }
}
