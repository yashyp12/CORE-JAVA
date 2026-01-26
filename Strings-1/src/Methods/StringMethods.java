package Methods;

import Strings.UserString;

public class StringMethods {
    public static void main(String[] args) {

        UserString str = new UserString("Yash");
        System.out.println(str.length());

        System.out.println(str.charAt(1));

        System.out.println( "org " + str + " code point  " +    str.codePointAt(3));

        System.out.println(str.codePointBefore(3));

    }
}
