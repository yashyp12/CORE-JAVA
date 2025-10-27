
public class CheckRotationPrime {

    public static void main(String[] args) {
        System.out.println(printAllRotations(1234));
    }

    // check if all the rotations are prime or not
    static boolean printAllRotations(int num) {
        for (int i = num; i != 0; i /= 10) {
            num = rotateNumber(num);

            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    static int rotateNumber(int num) {
        int last = num % 10;
        num /= 10;

        return last * power(10, count(num)) + num;
    }

    static int power(int base, int raise) {
        int pow = 1;
        while (raise > 0) {
            pow *= base;
            raise--;
        }
        return pow;
    }

    static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static boolean isPrime(int num) {
        int den = 2;
        while (den < num / 2) {
            if (num % den == 0) {
                return false;
            }
            den++;
        }

        return true;
    }

}
