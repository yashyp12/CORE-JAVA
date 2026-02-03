package List.LinkedList;

import org.w3c.dom.Node;

public class Driver {
    static void main(String[] args) {

        LL list = new LL();

//        list.insetFirst(23);
//        list.insetFirst(2);
//        list.insetFirst(6);
//        list.insetFirst(7);

//        list.display();

        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(12);
        list.insertLast(18);
//        list.display();
//        list.insert(34,1);
//        list.display();
//
//        list.deleteFirst();
        list.display();
//        list.deleteLast();
//        list.delete(2);
        System.out.println(list.find(8));
         list.display();

    }
}
