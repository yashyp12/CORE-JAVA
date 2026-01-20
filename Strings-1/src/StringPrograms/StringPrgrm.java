package StringPrograms;

public class StringPrgrm {

    public static void main(String[] args) {
        String str = "Yash";
//        for(int i =0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }


//        length of teh string without using lenth()
        int count = 0;
        for(char ch : str.toCharArray()){
            count ++;
            ch++;
        }
        System.out.println(count);


        System.out.println(str.startsWith("a"));
    }
}
