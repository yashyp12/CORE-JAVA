package Strings;

public class RevString {

    public static void main(String[] args) {
//        System.out.println("reverse Sstring");
        String str = "Yash";
//        System.out.println(reverseStr(str));


             System.out.println(reverInPlace(str));
    }

//    static String reverseStr(String str){
//        String rev = "";
//
//        for(int i=str.length()-1; i>=0; i--){
//            //get an index of last one start as i
//            char ch = str.charAt(i);
//
//            //add that chr as end of the new rev string
//            rev = rev+ch;
//        }
//        return rev;
//    }


//    doing it usign char array

    static String reverInPlace(String str){
//        convert the string to char array s o taht we can modify it
        char[] charArray = str.toCharArray();

        int start  =0;
        int end = str.length()-1;

        while(start<end){
//            swap char at start and end pointers
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end]  = temp;

            //move pointers inward
            start++;
            end--;
        }
//        conver modifed cahr back to String
        return new String(charArray);
    }
}
