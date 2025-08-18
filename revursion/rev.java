
public class rev {

    public static void main(String[] args) {

        int num = 123;
        int rev = reverseNum(num, 0);

        System.out.println("main");
        System.out.println(num + ": " + rev);

    }

    static int reverseNum(int num, int rev) {
        rev = rev * 10 + (num % 10);

        if (num == 0) {
            return rev;
        }

        return reverseNum(num / 10, rev);
    }
}
