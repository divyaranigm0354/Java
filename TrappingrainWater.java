import java.util.Arrays;
import java.util.Scanner;

public class TrappingrainWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
            int n =input.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        WaterStored(n,arr);


    }
    static int WaterStored(int n, int[] arr) {
        int res = 0;
        int maxileft = 0;
        int maxiright = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            if (arr[left] < arr[right]) {
                if (arr[left] > maxileft) {
                    maxileft = arr[left];
                } else {
                    res = res + (maxileft - arr[left]);

                }
                left++;
            } else {
                if (arr[right] > maxiright) {
                    maxiright = arr[right];
                } else {
                    res = res + (maxiright - arr[right]);
                }

                right--;
            }

        }
        System.out.println(res);
        return res;
    }

}
