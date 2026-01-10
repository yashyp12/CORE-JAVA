package Strings;

public class StringExample1 {
    public static void main(String[] args) {
String str = "Hello Yp";
String str1 = new String( "Hello Yp");
//
//        System.out.println(str1);
//        System.out.println(str == str1);
//        System.out.println(str.equals(str1));

        String a = "yash";
        String b = new String("yash");
        String c = b.intern();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());



    }
}
