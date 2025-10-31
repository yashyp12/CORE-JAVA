import java.util.Scanner;

public class rangeofPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        primeRange(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    static void primeRange(int start, int end) {
    
        // handle only ad byn 

        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }
    }


// skip even divisors 
    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        int c = 2;

        while (c * c <= num) {
            if (num % c == 0)
                return false;
            c+=2;
        }
        return c * c > num;
    }
}
