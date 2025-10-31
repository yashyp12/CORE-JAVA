package Strings;

public class Comparison {

    public static void main() {
//        String a = "Yash";
////        this is in pool
//        String b = "Yash";
//
//       System.out.println(a==b);
//

        String name1 = new String("Yash");
        String name2 = new String("Yash");

//now it will give false because even the val are same its pointing to the
// diff obj in heap but outside teh string pool
        // == is a comparitor
//        System.out.println(name1 == name2);

//to check only the values equals method is used
//        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));

    }
}
