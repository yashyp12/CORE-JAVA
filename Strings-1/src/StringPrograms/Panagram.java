package StringPrograms;

public class Panagram {
    //A pangram is a sentence that contains every letter of the alphabet at least once.
    public static void main(String[] args) {
/*
Create a list of all letters a to z

Convert the sentence to lowercase

For each alphabet letter, check:

Is this letter present in the sentence?

If any one letter is missing → not pangram

If all are present → pangram
 */
        String str = "The five boxing wizards jump quickly";

        if (isPanagram(str)) {
            System.out.println("panagram");
        } else {
            System.out.println("not a panagram");
        }
    }

    private static boolean isPanagram(String str) {

        str = str.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!containsChar(str, ch))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean containsChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }


}


