
import java.util.*;

public class PalindromeString {

    static String str;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        str = sc.next();

        if (isPalindrome()) {
            System.out.print(str + "its an palindrome");
        } else {

            System.out.print(str + "its not palindrome");
        }

    }

    public static boolean isPalindrome() {

        String rev = "";// empty

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            rev = ch + rev;

        }

        return str.equals(rev);
    }
}