import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class BubbleS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sort(n,arr);
        System.out.print(Arrays.toString(arr));


    }

    static void sort(int n,int[] arr) {
        /* selection sort andre
         * example
         *  2 6 1
         *  0 1 2
         * we should slect minimum index antha
         *
         *  i=0 min=0 j=1 a[1]<a[0] no 2 6 1
         *  i=0 min=0 j=2 a[2]<a[0] yes 1 6 2 swapped
         *
         * i=1 min=1   j=2 a[2]<a[1] yes 1 2 6j upto lessthan n hence upto 2
         *
         *
         */
        for (int i = 0; i <n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;

                }

            }
        }
    }
}
