import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Display the array
        System.out.println("Array: " + Arrays.toString(arr));

        // Taking input for the key to search
        System.out.print("Enter the element to search for: ");
        int key = input.nextInt();

        // Calling the linear search function
        int index = LS(arr, n, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int LS(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // return the index
            }
        }
        return -1; // return -1 if not found
    }
}
