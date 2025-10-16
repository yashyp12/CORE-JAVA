
import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        checkPrime(num);
    }

    public static void checkPrime(int num) {
        int den = 2;
        while (den < num) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (num == den) {
            System.out.println("its an prime");
        } else {
            System.out.println("its not prime");
        }
    }


    // 
    public static void checkFibo(int num) {
        int den = 2;
        while (den < num) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (num == den) {
            System.out.println("its an prime");
        } else {
            System.out.println("its not prime");
        }
    }
}
