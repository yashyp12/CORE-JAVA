package practise;

import java.util.*;

// wjp to find the character is uppercasse alhpa or not
public class Uppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        // int ch = sc.nextInt();
        // we are checking between the ranges
        // boolean op = ch>='A' && ch<='Z';

        // ascii values are ranges in A-Z = 65 to 90
        // for smaller alpha ranges a - z = 97 - 122
        // for the digits - 0 9 - 48 - 57
        // boolean op = ch>=97 && ch <=122;
        // System.out.println((int)ch);

        // checking whethe the num is smaller or not
        // boolean op = ch>=97 && ch<=122;
        // System.out.println( op);

        // at least one condition needs to be true
        // System.out.println(ch<2 || ch<5);

        // checking for the character
//         if(!((ch >= 65 || ch <= 90)
//                 && (ch >= 97 || ch <= 122)
//                 && (ch >= 48 || ch <= 58)))
// {
//     System.out.println("its a special character ");
// }
            
//     }


// if(!Character.isLetterOrDigit(ch))
// {
//     System.out.println("special character "    );
// }
    
//     else{
//         System.out.println("not special charcter");
//     }
    }
}
