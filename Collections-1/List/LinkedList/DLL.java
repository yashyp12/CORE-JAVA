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
        Node temp = head;
        newNode.next = null;

        if(head==null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while(temp.next!=null){
          temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;


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

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter (int after, int val){
        Node previous = find(after);

        if(previous==null){
            System.out.println("does not exist");
            return;
        }

        Node newNode = new Node(val);

        newNode.next = previous.next;
        previous.next = newNode;
        newNode.prev = previous;
        if(newNode.next!=null) {
            newNode.next.prev = newNode;
        }
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
