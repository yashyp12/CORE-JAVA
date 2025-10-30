
public class Factors21 {
    public static void main(String[] args) {
        // factors(new Scanner(System.in).nextInt());

        printPrimeFactors(36);
    }

    // printing prime factors

    static void printPrimeFactors(int num) {
        if (num <= 1)
            return;

            // prime factorisation
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                System.out.println(i + " ");
            }
        }

    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // static void factors(int num) {
    // if (num <= 1)
    // return;
    // int count = 0;
    // for (int i = 2; i <= num; i++) {
    // if (num % i == 0) {
    // System.out.println(i);
    // count++;
    // }
    // }

    // }
}
