package StringPrograms;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*

What is an Anagram? (lock this first)

Two strings are anagrams if:

They contain the same characters

With the same frequency

Order does NOT matter

 */

/*
🔹 Logic (plain English)

If lengths differ → return false

Convert both strings to char[]

Sort both arrays

Compare arrays

If equal → anagram
 */

        String str1= "top";
        String str2= "tpo";

        if(isAnagram(str1,str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }

    static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

//        2 convert to char rrays
        char[]ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();

//        SORT BOTH ARRAYS
        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        compare arrays
        return Arrays.equals(ch1,ch2);
    }
}
