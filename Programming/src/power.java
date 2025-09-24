import java.util.Scanner;

public class power {
    static int base = new Scanner(System.in).nextInt();
    static int raise = new Scanner(System.in).nextInt();


    static int ans = 1;

    public static void main(String[] args) {

        while (raise > 0) {
            ans *= base;
            raise--;
        }
        System.out.println(ans);
    }
}
