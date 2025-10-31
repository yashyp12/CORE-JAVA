import java.util.Scanner;

public class numReverse {
    public static void main(String[] args) {

        System.out.println(reverseNum(new Scanner(System.in).nextInt()));
    }

    static int reverseNum(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;

    }
}
