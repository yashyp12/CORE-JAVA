package Collections.ListInterface.LinkedList;
import java.util.Queue;
import java.util.Deque;

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


       System.out.println( list3.peek());
//       adds teh elemtn at last
       System.out.println(list3.offer(9));
       System.out.println(list3);

//       retrieves and remove the first elemtn fro mthe linnkedlsit
       System.out.println(list3.poll());
       System.out.println(list3);

//       Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list
       System.out.println(list3.pop());
       list3.addLast(34);
    }
}
