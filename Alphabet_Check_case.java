import java.util.Scanner;

import static java.lang.System.in;

public class Alphabet_Check_case {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
       // String word = "hello";
        //System.out.println(ch);
        if(ch >= 'a' && ch <='z'){
            System.out.println("lower case");
        }else{
            System.out.println("upper case");
        }

    }
}
