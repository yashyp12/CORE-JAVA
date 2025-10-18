
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UpcastExamp {

    public static void main(String[] args) {
// exam of upcasting - 
// get class shows the runtime class
/*
 * Even though the reference type (List) stays the same,
the actual object type keeps changing at runtime.
This is runtime polymorphism —
same parent type (List) can hold objects of different child classes.
 */
        List obj = new ArrayList<>();
        System.out.println(obj.getClass());
        obj = new LinkedList<>();
        System.out.println(obj.getClass());
        obj = new Vector();
        System.out.println(obj.getClass());
    }

}
