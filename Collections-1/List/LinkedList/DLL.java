package List.LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;




    public void insertFirst(int val) {
        Node newNode = new Node(val); //box is created new

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode; // head maybe null if isnerting at first
        }else{
            tail = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);

        //case 1 - empty list
        if (head == null) {
            head=tail=newNode;
        }
        //case 2- non empty list
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(+temp.val + " ->");
            last = temp;
            temp = temp.next; //not chaning modifying the structure of the linked list
        }

        System.out.println("END/NULL");

//        //printing in reverse
        System.out.println("print in reverse");
//
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("start");

    }


    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
