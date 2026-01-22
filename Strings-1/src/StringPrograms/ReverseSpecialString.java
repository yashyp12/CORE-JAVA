package StringPrograms;

public class ReverseSpecialString {

    public static void main(String[] args) {
        String str = "he#1@a!v";
//        System.out.println(str);

        String str2 = new StringBuffer(str.replaceAll("[^A-Za-z]","")).reverse().toString();
        String str3 = "";

        int indx = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=97 && ch<=122){
                str3+=str2.charAt(indx++);
            }else{
                str3+=ch;
            }
        }

        System.out.println(str3);

    }
}
