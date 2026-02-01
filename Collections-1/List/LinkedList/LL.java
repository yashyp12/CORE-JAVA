package List.LinkedList;

public class LL {

    private class Node{
        private int value;
        private Node next;
        private int size;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.next = next;
            this.value = value;
        }
    }
}
