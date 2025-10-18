
import java.util.Scanner;

public class PrimeRange1 {

    // rannge of prime num 
    public static void main(String[] args) {

        System.out.println("Enter the starting Num");
        int start = new Scanner(System.in).nextInt(); //5

        System.out.println("Enter the end Num");
        int end = new Scanner(System.in).nextInt(); //20
        System.out.println("***************************");

        while (start <= end) {  // 5  20

            if (isPrime(start)) { // if true 
                System.out.println(start);
            }

            //whether is true or false go to next num
            start++;

        }

    }

    public static boolean isPrime(int num) {
        int den = 2;

        while (den < num / 2) {
            if (num % den == 0) {
                break;
            }
            den++;
        }
        return true;
    }
}
