public class PowerRecursion {

    public static void main(String[] args) {
        power(2, 3);
        fibo21(0, 1, 5);
    }

    static int power(int base, int raise) {
        if (raise == 0) {
            return 1;
        }

        return base * power(base, raise - 1);
    }

    static void fibo21(int n1, int n2, int n) {

        if (n == 0) {
            return;
        } else {
            System.out.println(n1);
            fibo21(n2, n1 + n2, n - 1);
        }
    }
}
