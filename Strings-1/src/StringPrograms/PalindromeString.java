package StringPrograms;

public class PalindromeString {

    public static void main(String[] args) {

        String str = "aysa";
        System.out.println(isStrPalindrome(str));

    }

    static boolean isStrPalindrome(String str){
        int start =0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
