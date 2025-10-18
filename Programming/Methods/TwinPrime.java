
public class TwinPrime {

    public static void main(String[] args) {

//  the num which are prime - 2 no has to be prime 
//  nd thier dif has to be must be 2 will take 2 input
        System.out.println(isTwinPrime(9, 7));
    }

    public static boolean isTwinPrime(int n1, int n2) {
        if (n1 - n2 == 2 || n2 - n1 == 2) {
            return isPrime(n1) && isPrime(n2);
        }
        return false;
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
