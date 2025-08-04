
import java.util.Scanner;

public class Palindrome {

    static int num = 121; // this is global one so that it will accesible everywhere

    public static void main(String[] args) {

        // 121 - 121 its an palindrome num
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        num = sc.nextInt();

        if (isPalindrome()) {
            System.out.println(num + "its an palindrome");
        } else {
            System.out.println(num + "its not palindrome");
        }

    }

    //access modififer non access modifier return type method name
    public static boolean isPalindrome() {

        // nothing just 122 just pick up the last number or store it in rev variable 
        /*
          * we can pick up lasst one by taking it reminder using % which gives last digit
          to shift the number to left will multiply rev by 10 so that previous num will shift to left or then add rem
          at the last compare the rev with the original
         */
        int rev = 0;
        int rem;
        int dup = num;
        
        // rem -1 , rem - 
        // we are adding this condition because for every iteration we are removing the last digit from the dup 
        // when it becomes 0 loop wil get execute
        while (dup != 0) {
            rem = dup % 10; // 121 -> return 1 
            rev = rev * 10 + rem; // 0*10+1
            dup = dup / 10;
        }

        if (num == rev) {
            return true;
        } else {
            return false;
        }

    }
}
