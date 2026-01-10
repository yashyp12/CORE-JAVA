package Strings;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0,consonents =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch >='a' && ch<='z'){
                if(ch == 'a' || ch=='e' || ch=='i' ||ch=='o'|| ch=='u'){
                    vowels ++;
                }else{
                    consonents++;
                }
            }


        }
     System.out.println(" no of vowels and consonant are " + vowels + " & " + consonents);


    }
}
