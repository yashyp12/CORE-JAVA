package StringPrograms;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {
        String str = "abcdefancghiacbj";
        String longest = longestNonRepeatingSubstring(str);
        System.out.println(str);
        System.out.println(longest);
    }

    static String longestNonRepeatingSubstring(String str){
        String longest ="";

        for(int i =0;i<str.length();i++){
            String str1 = str.charAt(i)+"";
            for(int j = i+1;j<str.length();j++){
                char ch = str.charAt(j);
                if(!(str1.contains(ch + ""))){
                    str1+=ch;
                }else{
                    if(longest.length()<str1.length()){
                        longest = str1;
                    }
                    str1="";
                }
            }
            if((str.length()-i)<longest.length())
                break;
        }
        return longest;
    }
}
