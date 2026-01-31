package List.LinkedList;


class UserNoSuchElementException extends RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}

public class UserLinkedList<E> {
    private int indx ;
    private Node<E> head;
    private Node<E> tail;

    private class Node<E>{
        E ele;
        Node<E> next;

        public Node(E ele){
            this.ele = ele;
        }
    }

    @Override
    public String toString(){
        if(indx==0) return "[]";

        Node<E> currEle = head;
        String resp = "[";

        while(currEle.next!=null){
            resp+= currEle.ele+", ";
            currEle = currEle.next;
        }

        resp+= currEle.ele+"]";
        return resp;
    }

    public boolean add(E ele){
        Node<E> newNode = new Node(ele);

        if(indx==0){
            head = newNode;
            tail = head;
            indx++;
        }else{
            tail.next = newNode;
            tail = newNode;
            indx++;
        }
        return true;
    }

    public void addLast(E ele){
        add(ele);
    }

    public void addFirst(E ele){
        Node<E> newNode = new Node<E>(ele);
        newNode.next = head;
        head = newNode;
        indx++;
    }

    public int size(){
        return indx;
    }

    public E getFirst(){
        if(size()==0){
            throw new UserNoSuchElementException();
        }
        return head.ele;
    }

    public E getLast(){
        if(size()==0){
            throw new UserNoSuchElementException();
        }
        return tail.ele;
    }

    public boolean isEmpty(){
        return size()==0;
    }
}

class Main{

    static void main(String[] args) {
    UserLinkedList<Integer> list = new UserLinkedList<>();

        System.out.println(list.add(19));
        System.out.println(list.add(15));
        System.out.println(list.add(123));
        System.out.println(list);

        list.addLast(23);
        System.out.println(list);
        System.out.println(list.getLast());

    }

}