package List.LinkedList;

class UserIndexOutOfBoundsException extends RuntimeException{
    UserIndexOutOfBoundsException(String desc){
        super(desc);
    }
}

class UserNoSuchElementException extends RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}

public class UserLinkedList<E>  {
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

        if(size() ==0) throw new UserNoSuchElementException();
        add(ele);
    }

    public void addFirst(E ele){
        if(size()==0) throw new UserNoSuchElementException();
        Node<E> newNode = new Node<E>(ele);
        if(indx==0){
            head = tail = newNode;
        }else{
            newNode.next =head;
            head = newNode;
        }
        indx++;
    }

    public int size(){
        return indx;
    }


    public E removeLast(){
        if(size()==0) throw new UserNoSuchElementException();

        E temp = tail.ele;
        Node<E> curr = head;

        for(int i =0;i<size()-2;i++){
            curr = curr.next;
        }

        tail = curr;
        curr.next = null;
        indx--;
        return temp;

    }

    public E removeFirst(){
        if(size()==0) throw new UserNoSuchElementException();

        E temp = head.ele;
        Node<E> curr = head;
        head = head.next;
        curr.next = null;
        indx--;
        return temp;
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


    public void add(int indx, E ele){
        if(indx<0 || indx>size()){
            throw new UserIndexOutOfBoundsException("Index : "+indx+", Size"+ size());
        }

        Node<E> newNode = new Node<E>(ele);
        Node<E> curr1 = head;
        for(int i =0;i<indx-1;i++){
            curr1 = curr1.next;
        }
        Node<E>curr2 = curr1.next;


        newNode.next = curr2;
         curr1.next = newNode;

         if(newNode.next == null){
             tail = newNode;
         }
        this.indx++;
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

        list.addFirst(22);
        System.out.println(list);

    }

}