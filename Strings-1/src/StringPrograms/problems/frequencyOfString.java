package StringPrograms.problems;

class frequencyOfString1 {
/*
in this example -aabbbcdddde
                a2b3c1d4e1  -> no of times the character comes in the string


                 String str = "aabbbcdddde";
        String str1 = "";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                str1 += str.charAt(i) + "" + cnt; //assign it first then reset it to default 1
                cnt = 1;
            }
        }
        str1 += str.charAt(str.length() - 1) + "" + cnt;
        System.out.println(str1);
 */

    public static void main(String[] args) {
        String str = "aaabbccccdd";
        System.out.println(stringFrequency(str));
    }

    //string - aabbbcdddde
    static String stringFrequency(String str){
        String str1 ="";
        int cnt = 1;

        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                str1 += str.charAt(i) + ""+cnt;
                cnt =1;
            }
        }

        //manually add the last one
        str1 += str.charAt(str.length()-1) + "" + cnt;
        return str1;
    }

}