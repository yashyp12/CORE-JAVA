public class PrimeFactorisation {
    public static void main(String[] args) {
        int num = 36;

       primeFactors(num);
    }

    public static void primeFactors(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    // 36
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false; // we are checking all even num

        // here we are checking only odd num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
