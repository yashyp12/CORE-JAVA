package Collections;

import java.util.*;

public class Vector21 {
//similar to arraylst but this is synchronised and slower
    // use onl when we want to deal with the multithreain applications
    public static void main(String[] args) {

        /*
        List<Integer> vector  // reference variable (interface type)
       ↓
new Vector<>()        // actual object (class type)

         */

        List<Integer> vector  = new Vector<>();
        vector.add(45);
        vector.add(65);
        vector.add(25);
        System.out.println(vector);

    }
}
