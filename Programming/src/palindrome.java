
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        //num is same from every direction  
        int num = new Scanner(System.in).nextInt();
        int dup = num;
        int ans = 0;

        while (dup != 0) {

            int last = dup % 10;
            ans = ans * 10 + last;
            dup /= 10;

        }

        if (ans == dup) {
            System.out.println("its an palindrome num");
        } else {
            System.out.println("not an palindrome num");
        }
    }

}
