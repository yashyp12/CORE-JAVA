package Strings;
import java.util.ArrayList;
public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b'); // returns unicode
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

//        when an integer concatenated in the string its converted
        // into its wrapep clas Integer that will call toString()
        // this is like this afte concat = "a" + "1"
        System.out.println("a" + 1);

////        in this case it will show the obj rfe becasue teh array dont call the method toString
//        System.out.println("Yash " + new int[]{});

////        in this case it will show the empty arrllist because arraylist has overrided toString
//        System.out.println("Yash " + new ArrayList<>());

//        System.out.println("Yash "+ new Integer(25));


//        it will throw an error because
        // the + opearator in java only defined for primitves and
//         for any one of its value is String below entire thing is expression
//        System.out.println(new Integer(15) + new ArrayList<>());
//we can use + with any objects but any one has to be String entire result will be of String type




    }
}
