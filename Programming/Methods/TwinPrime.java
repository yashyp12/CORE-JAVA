
import java.util.Scanner;

public class TwinPrime {

    public static void main(String[] args) {

//  the num which are prime - 2 no has to be prime 
//  nd thier dif has to be must be 2 will take 2 input
        //     System.out.println(isTwinPrime(9, 7));
        // }
        // public static boolean isTwinPrime(int n1, int n2) {
        //     if (n1 - n2 == 2 || n2 - n1 == 2) {
        //         return isPrime(n1) && isPrime(n2);
        //     }
        //     return false;
        // }
        // public static boolean isPrime(int num) {
        //     int den = 2;
        //     while (den < num / 2) {
        //         if (num % den == 0) {
        //             break;
        //         }
        //         den++;
        //     }
        //     return true;
        // A twin prime is a prime number that is either 2 less or 2 more than another      prime number—for example, either member of the twin prime pair (41, 43). In other       words, a twin prime is a prime that has a prime gap of two.
        System.out.println("Enter the number 1");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter the number 2");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println(isTwinPrime(num1, num2));
    }

// make an method for checking twin Prime
    public static boolean isTwinPrime(int num1, int num2) {

        if (num1 - num2 == 2 || num2 - num1 == 2) {

            return isPrime(num1) && isPrime(num2);
        }

        return false;
    }

    public static boolean isPrime(int num) {
        int den = 2;
        while (den <= num / 2) {
            if (num % den == 0) {
                break;
            }
            den++;
        }
        if (den > num / 2) {
            return true;
        } else {
            return false;
        }

    }

}
