package Strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StrMethods {

    public static void main(String[] args) {

//        String str = "YashPatilYp";
//        char[]passwprd = {'t','b','r','s'};
//
//        System.out.println(passwprd);

        //uses internalyl the char[] constructoe whic converts it to string
//        String s  = new String(passwprd);
//        System.out.println(s);


//        String(char[]val, int offse , int count
        //String s = new String(charArray, startIndex, length);
//        String s1 = new String(passwprd,0,3);
//        System.out.println(s1);


        //5️⃣ String(byte[] bytes) - conevert acii byte into char
//        byte[]b = {65,66,67};
//        String sm = new String(b);
//        System.out.println(sm);

//        byte[]arr = new byte[20];
//        for(byte i =0,j=0;j<arr.length;i++){
//            arr[j++] = i;
//        }
//        String strx = new String(arr);
//        System.out.println(strx);


//6️⃣ String(byte[] bytes, int offset, int length)

//        String s= new String(bytes, start,length);
//byte[]b1 = {71,72,101,111};
//String sb1 = new String(b1,0,3);
//        System.out.println(sb1);

//        7️⃣ String(StringBuilder sb)
//        StringBuilder sb = new StringBuilder("java");
//        String sx = new String(sb);
//        System.out.println(sx);


//strings method category wise
String s = "Yash"; // spaces , charceters are counted
        System.out.println(s.length()); // return the num of characters present in strings
        System.out.println(s.isEmpty()); //Checks whether the String length is 0.

        System.out.println(s.isBlank()); // java11, check empty or contains only whitespace charcters

        System.out.println(s.charAt(s.length()-1));

// /    category 2 comparison
        










    }
}
