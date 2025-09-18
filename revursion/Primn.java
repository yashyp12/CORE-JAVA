
import java.util.Scanner;

public class Primn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        if (isPrime(sc.nextInt(), 2)) {  // 31

            System.out.println("PRIME");

        } else {
            System.out.println("not PrimeNumber");
        }
    }
                                //31 , 2
    public static boolean isPrime(int num, int start) {
            // 31 < 2
        if (num < 2) {
            return false;
        }

        //  2 >= 16 ->fALSE
        if (start >= (num / 2) + 1) {
            return true;
        }
        // 31 % 2 ==0
        if (num % start == 0) {
            return false;
        }
        return isPrime(num, ++start);

    }
}
