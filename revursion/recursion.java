
public class recursion {

    public static void main(String[] args) {

        int n = 4;
//5 means 5 * 4 *3*2*1 means indirectly 5 * 4!;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
