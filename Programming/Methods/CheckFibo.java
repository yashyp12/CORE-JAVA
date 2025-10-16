
public class CheckFibo {

    public static void main(String[] args) {

        int num = 4;
        checkFibo(55);
    }

    public static void checkFibo(int num) {
        int n1 = 0, n2 = 1, n3;

        while (true) {
            n3 = n1 + n2;

            if (n1 == num) {
                System.out.println("its an fibo ");
                break;
            } else if (n1 > num) {
                System.out.println("its not an fibonacii num");
                break;
            } else {
                n1 = n2;
                n2 = n3;

            }
        }

    }
}
