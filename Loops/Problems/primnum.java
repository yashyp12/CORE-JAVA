
import java.util.Scanner;

public class primnum {

    public static void main(String[] args) {

        System.out.println("enter the num user ");
        int num = new Scanner(System.in).nextInt();

        if (isPrime(num)) {
            System.out.println("its an prime num");
        } else {
            System.out.println("its not an prime num");
        }
    }

    public static boolean isPrime(int num) {

        if (num < 0 || num == 1) {
            System.out.println("invalid input Entered");
            return false;
        }


        /* the loop will run from 2 to the num/2
         * because any num greater than num/2 is 
         * cannot divide num evenly so thats why
         * we are skipping 1
         */
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
