package Collections.ListInterface.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackExamp {

    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

//        follows last in first out
        System.out.println(stack);
        Integer removeElement = stack.pop();
        System.out.println(removeElement);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

       stack.add(3,4);
        System.out.println(stack);

        stack.remove(2);
        System.out.println(stack.search(4)); // 1 based indexing


//        linked list as stack
    LinkedList<Integer> list = new LinkedList<>();
    list.add(23);
    list.addFirst(4);
    list.add(23);
    list.get(3);
    list.getLast();
    list.size();


    


    }

    ;
}
