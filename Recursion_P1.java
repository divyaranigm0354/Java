import java.util.Scanner;

public class Recursion_P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name:" );
        String name = input.next();
        f1(name);

    }

    static int count=0;
    static void f1(String name){
        if(count==4){
            return;

        }
        System.out.println(name);

        count++;
        f1(name);


    }
}
