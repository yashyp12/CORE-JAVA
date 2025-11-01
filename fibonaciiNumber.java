public class fibonaciiNumber {
    public static void main(String[] args) {
        System.out.println(fibonaciiNum(12));

    }

    static boolean fibonaciiNum(int num) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (n1 <= num) {

            if (n1 == num)
                return true;

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
        return false;

    }
}
