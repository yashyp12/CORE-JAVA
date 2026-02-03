package List.LinkedList;

import java.util.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");

    }

    public void insert(int val, int index) {
        if (index == 0) {
            insetFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head; //8

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node NewNode = new Node(val, temp.next);
        temp.next = NewNode;

        size++;

    }

    public void insertLast(int val) {
        Node newNode = new Node(val);

        //list is empty
        if (tail == null) {
            insetFirst(val);
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }


    public void insetFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }


    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}


