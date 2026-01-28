package StringPrograms;

import org.w3c.dom.ls.LSOutput;

public class ReverseString {

    public static void main(String[] args) {

        String str = "JAVA IS EASY";
        String op = reverseLogic1(str);
        System.out.println(op);
        String op2 = reverseLogic2(str);
        System.out.println(op2);

    }

    private static String reverseLogic2(String str) {
        String[] arr = str.split(" ");
                String str1 = "";
        int indx = 0;

        for(String ele: arr){
            str1 +=reverseString(ele)+" ";
        }
        return str1.trim();

    }

    private static String reverseString(String str) {
        String rev ="";
        for(char ele: str.toCharArray()){
            rev = ele+rev;
        }
        return rev;
    }

    private static String reversestrr(String str){
        String rev1 = "";

        for(char ele:str.toCharArray()){
            rev1+=ele+rev1;
        }
        return rev1;
    }

    private static String reverseLogic1(String str) {
        String str3 = "";
        String str2 ="";

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == ' ') {
                str3 += str2 + " ";
                str2="";
            }
            str2 = ch+str2;
        }
        str3 = str3.trim();
        str3 += " " + str2;
        return str3;
    }


}
