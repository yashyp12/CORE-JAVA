package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();

        node2.value = 2;
        node1.value = 1;
        node1.next = node2;
        node2.next = null;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
//time complexity O(N)
        linkedList.get(2);
        linkedList.addLast(4); // time complexity O(1)
        //BECAUSE THERE IS NO SHIFTING HERE
        linkedList.addFirst(0); // time complexity O(1)
        linkedList.getFirst();

        System.out.println(linkedList);
        linkedList.remove(0);
        linkedList.removeFirst();
//        should return true or false - > jdk 8
        linkedList.removeIf(x -> (x % 2 == 0)); // removes even
        System.out.println(linkedList + " after  remove if");
        linkedList.peek(); // return first elemt
        linkedList.peekFirst();
        linkedList.poll();
        linkedList.pollLast();


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dog", "monkey"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("cat", "dog", "lion"));

        animals.removeAll(animalsToRemove); // will remove animals from animaltoremove means commond
        System.out.println(animals);

    }
}


class Node {

    public int value;
    public Node next; // reference to nextNode


}