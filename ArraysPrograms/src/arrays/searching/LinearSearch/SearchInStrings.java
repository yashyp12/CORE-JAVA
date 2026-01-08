package arrays.searching.LinearSearch;

import java.util.Arrays;

public class SearchInStrings {

    static void main(String[] args) {
        String name = "Yash";
        char target = 'y';
        System.out.println(searchStr(name, target));


//        System.out.println(Arrays.toString(name.toCharArray())); // CRETES AN CHAR ARRAY

    }

    static boolean searchStr(String str, char target) {
        if (str.isEmpty()) return false;

        for (char ch : str.toCharArray()) {
            return ch == target;
        }


        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
}
