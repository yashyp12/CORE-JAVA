public class paindroNum {
    // palindrome num

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    static boolean isPalindrome(int num) {

        int rev = 0;
        int temp = num;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev == temp;
    }
}
