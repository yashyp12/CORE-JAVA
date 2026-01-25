package StringPrograms;

public class LongestPalindromicString {
//wrong
    public static void main(String[] args) {
        String str = "abcedefabcghiacbj";
        String longest = longestPalindromicSubString(str);
        System.out.println(str);
        System.out.println("Longest" + longest);
    }

    private static String longestPalindromicSubString(String str) {

    String longest = "";

    for(int i =0;i<str.length();i++){
        String str1 ="";

        for(int j =i;j<str.length();j++){
            str1 +=str.charAt(i);

            if(isPalindrome(str1)){
                if(str1.length()>longest.length()){
                    longest = str1;
                }
            }
        }

        if((str.length()-i)<longest.length()){
            break;
        }

    }
    return longest;
    }

    private static boolean isPalindrome(String s) {

        int l=0;
        int r = s.length()-1;

        while (l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }


}
