package DSA.lIinearSearchArray;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "Yash";
//        char target = sc.next().toLowerCase().charAt(0);

//        System.out.println(  search(name, target));

//        System.out.println(Arrays.toString(name.toCharArray()));




    }

    static boolean search2(String str, char target) {
        if (str == null) {
            return false;
        }

//        conveted a asrting into the array
        for (char ch : str.toCharArray()) {
            if (ch == target) return true;
        }
        return false;
    }


    static boolean search(String str, char target) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {

            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
