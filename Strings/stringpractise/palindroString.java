public class palindroString {

    public static void main(String[] args) {
        String str = "abcdcba";

        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0)
            return true;

        str = str.toLowerCase();
        // here the lenght is a function but in the array its a variable

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end)
                return false; // this means the satrt end not same
            // for obivous reason the string is not same
        }
        return true;
    }
}
