import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        greetings();
        int[] arr = {1,7, 8 ,9 ,2};
        change(arr);
        int ans = sum(3,4,9);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=99;
    }
    static void greetings(){
        System.out.println("hello");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
