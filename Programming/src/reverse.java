
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int ans = 0;

        while (num != 0) {
            int last = num % 10;
            ans = ans * 10 + last;
            num /= 10;
        }

        System.out.println(ans);
    }
}
