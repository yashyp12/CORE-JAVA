package Collections.ListInterface.Vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {


    static void main(String[] args) {
//        Vector<Integer> vect = new Vector<>(12);
        Vector<Integer> vect = new Vector<>(5,3);
vect.add(1);
vect.add(1);
vect.add(1);
vect.add(1);
vect.add(1);
vect.add(1);
vect.add(1);
        System.out.println( vect.capacity());

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1,5,2));
        System.out.println(vector1);


        vect.add(1,25);
        vect.get(4);
        vect.set(1,69);
        vect.size();
        vect.contains(2);

        for (Integer integer : vector1) {
            System.out.println(integer);
        }


    }
}


