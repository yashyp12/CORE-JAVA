package Strings;

public class BuilderString {


    public static void main(String[] args) {

        //    String builder is a class
//        used when we want to modify existing string and our string is dynamic
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch + " ");
        }
//        its not creating new obj modifying existing one this is mutable

        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println("after reverse " + builder);


    }
}
