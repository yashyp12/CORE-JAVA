package Collections.ListInterface.ArrayList2;

import java.util.ArrayList;

public class ArrayListEx {

   public static void main(String []args) {


       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> listTemp = new ArrayList<>();

       list.add(23);
       list.add(23);
       list.add(23);
       list.add(43);
       list.add(353);

       System.out.println(list);


       System.out.println(  list.subList(0,2));

       list.ensureCapacity(3);

       listTemp.add(3);
       listTemp.add(42);
       list.addAll(listTemp);

       System.out.println("after contains() " + list.contains(23) );

       list.removeAll(listTemp);
       list.addFirst(2);

       System.out.println("hash code" + list.hashCode());
       System.out.println( list.getFirst());
       System.out.println(list + " after usign add first");


       System.out.println( list.indexOf(23));

       list.toArray(new Integer[0]);
       System.out.println( );

    }

}
