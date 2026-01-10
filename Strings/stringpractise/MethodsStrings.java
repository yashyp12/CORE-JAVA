package Strings;

import java.util.Arrays;

public class MethodsStrings {

   public static void main(String args[]) {

       String name = "Yash Y Patil ";
//       System.out.println(name.charAt(0));

//       converted into toCharArray () character array
       System.out.println(Arrays.toString(name.toCharArray()));

       System.out.println(name.toLowerCase());
//       ORIGINAL ONE WILL NEVER CHANGE IT WILL JUST CREATING AN NEW OBJ

       System.out.println(name);

       System.out.println(name.indexOf('a'));

// strip - white spacces are remove extra saapce

       System.out.println("       yassh  ".strip());

//         these lines basically just take the pieces from teh name and adds that one in the array
       System.out.println(Arrays.toString( name.split(" " )));





    }
}
