
import java.util.Scanner;

public class power {

    static int store = 1;

    public static void main(String[] args) {
        int base = new Scanner(System.in).nextInt();
        int expo = new Scanner(System.in).nextInt();
        // power of 4^3 4*4*4  

        int op = powers(base, expo);
        System.out.println(op);
    }
//                          4       3

    static int powers(int base, int expo) {

        if (expo != 0) {
            store = store * base;
            // store = 4
        }

        if (expo == 0) {
            return store;
        }
//                    4 , 3-1 = 2
        return powers(base, expo - 1);

    }
}
