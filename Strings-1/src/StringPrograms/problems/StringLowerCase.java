package StringPrograms.problems;

import java.util.Scanner;

public class StringLowerCase {

    public static void main(String[] args) {
        /*input - a   -> 1
        b   -2
        c  -3
        z - 26
        aa - 27
        ab - 28
        az - 52
        ba - 53
         */
        System.out.println("Enter a String");
        String str = new Scanner(System.in).next();

        int op = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                op = ch - 96;
            } else {
                op = op * 26 + (ch - 96);
            }
        }
        System.out.println(op);
    }

}
