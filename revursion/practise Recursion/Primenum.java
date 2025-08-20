
import java.util.Scanner;

public class Primenum {

    static int count = 2;

    public static void main(String[] args) {

        System.out.println("enter the num");
        int num = new Scanner(System.in).nextInt();
        prime(num, count);

        if () {
            System.out.println("the num is prime");
        } else {
            System.out.println("num is not prime");
        }

    }

    static boolean prime(int num, int count) {
//12

        if (count >= num) {
            return false;
        }

        if (num <= 1) {
            return false;
        } else if (num % count == 0) {

            return false;
        }

        return prime(num, count + 1);

    }
}
