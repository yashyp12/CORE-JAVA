
import java.util.Scanner;

public class PrimeNos {

    static int num;
    static int dup;
    static boolean result; // flase

    public static void main(String[] args) {

        System.out.println("Enter the num");
        num = new Scanner(System.in).nextInt();

        dup = num;
        Prime();
        System.out.println("the number " + result);

        //num - 12
        // dup = 12
        // num = 11
    }

    static void Prime() {
        if (num < 2) {
            return;
        }
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
