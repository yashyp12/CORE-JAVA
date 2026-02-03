package List.LinkedList;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node newNode =  new Node(val); //box is created new

        newNode.next = head;
        newNode.prev = null;
        if(head!=null) {
            head.prev = newNode; // head maybe null if isnerting at first
        }
        head = newNode;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print("HEAD -> " + temp.val + " ->");
            temp = temp.next; //not chaning modifying the structure of the linked list
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
