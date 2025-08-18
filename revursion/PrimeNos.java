
import java.util.Scanner;


public class PrimeNos {

    static int num;
    static int dup;
    static boolean result; // flase

    public static void main(String[] args) {

        System.out.println("Enter the num");
        num = new Scanner(System.in).nextInt();
        dup = num;

        System.out.println("the number " + dup + "is Prime " + result);
        dup = num;

        //num - 12
        // dup = 12
        // num = 11
    }

    static void Prime() {

        --num;
        if (num == 2) {
            result = true;
            return;
        }

        if (dup % num == 0) {
            return;
        }
        Prime();
    }
}
