import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int target= input.nextInt();
        System.out.println(target);
        Arrays.sort(arr);
        boolean result = twosum(n, arr, target);

        if (result) {
            System.out.println("Found two numbers that add up to the target.");
        } else {
            System.out.println("No two numbers add up to the target.");
        }


    }
    static boolean twosum(int n ,int[] arr,int target){
        int start=0;
        int end=n-1;
        while(start<=end){
            int sum= arr[start]+arr[end];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }

        }
        return false;

    }
}
