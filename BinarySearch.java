import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take number of elements
        System.out.println("Enter number of elements:");
        int n= input.nextInt();
        int[] arr = new int[n];
        //take an array input
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
           arr[i] = input.nextInt();
        }


            System.out.println(Arrays.toString(arr));

        System.out.println("enter the key:");
        int key = input.nextInt();


        int index =  BS(arr, n, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

    }

    static int BS(int[] arr, int n, int key) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == key) {
                return mid; // Return the index if found
            } else if (arr[mid] < key) {
                s = mid + 1; // Move search space to the right
            } else {
                e = mid - 1; // Move search space to the left
            }
        }

        return -1; // Return -1 if not found
    }
}