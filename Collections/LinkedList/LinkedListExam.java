package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExam {

   public static void main(String[] args) {
 LinkedList<Integer> list3 = new LinkedList<>();
       System.out.println(list3);
list3.add(45);
list3.add(55);
list3.add(69);
list3.add(75);
       System.out.println(list3);
list3.removeFirst();

       System.out.println(list3.reversed() );
    }
}
