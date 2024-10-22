import java.util.Arrays;
import java.util.Scanner;



public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = input.nextInt();
        int [] arr= new int[n];
        //take array  input
        System.out.println("enter the number of elements");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        bs(n,arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
    buuble sort andre last element sort aguthe modlu
    first eredu next eredu check madi sort madadu
    1 3 2
   modlu
   1 ,3
   1 3 2
   amel
  3 2
   1 2 3
    * */
    static void bs(int n , int[]arr) {
       //insertion sort
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j>=0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;

            }
        }
    }
}
