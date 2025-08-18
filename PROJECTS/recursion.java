
import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
        int store = fact(num);
        System.out.println(store);
    }

    // factorial using recursion  -> FACT = FACT*(FACT(NUM-1))
    // 5! = 4! -> 4*3*2*1
    static int fact(int num) {

        if (num == 0 || num == 1) {
            return 1;

        }

        //fac = 5 * fact(5-1);
        int fac = num * fact(num - 1);
        return fac;

    }

}
