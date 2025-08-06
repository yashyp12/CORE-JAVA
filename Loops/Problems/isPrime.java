
import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if (isPrimes(num)) {
            System.out.println("is prime");
        } else {
            System.out.println("its not an Prime");
        }
    }

    public static boolean isPrimes(int num) {
        if (num < 2) {
            return false;
        }

        //num/2 means we ar taking half value of num because no can only divisble to only half number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
