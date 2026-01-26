package List.ArrayList;

import java.util.ArrayList;

class UserIllegalArgumentException extends RuntimeException {
    UserIllegalArgumentException() {
        super();
    }
}

class UserIndexOutOfBoundsException extends RuntimeException {
    UserIndexOutOfBoundsException(String message) {
        System.out.println(message);
    }
}

class UserNoSuchElementException extends RuntimeException {
    UserNoSuchElementException() {
        super();
    }
}

public class UserArrayList<E> {

    private final int INITIAL_CAPACITY = 10;
    private E[] arr;
    private int indx;

    public UserArrayList() {
//        Because Java DOES NOT allow creating generic arrays.
//        Generics exist only at compile time (type erasure).
//At runtime Java does NOT know what E is.

        arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    public UserArrayList(int initCapacity) {
        if (initCapacity > 0) {
            this.arr = (E[]) new Object[initCapacity];
        } else if (initCapacity == 0) {
            this.arr = (E[]) new Object[0];
        } else {
            throw new UserIllegalArgumentException();
        }
    }


    @Override
    public String toString() {
        if (indx == 0) return "[]";
        String op = "[";
        for (int i = 0; i < indx - 1; i++) {
            op += arr[i] + ", ";
        }
        op += arr[indx - 1] + "]";
        return op;
    }

    public void add(int indx, E ele) {
        if (indx < 0 || indx >= size())
            throw new UserIndexOutOfBoundsException("Index out of bounds exeception " + indx + "of size " + size());

        if (arr.length == size()) {
            E[] newArr = (E[]) new Object[newCapacity(arr.length)];
            int i = 0; //aarray index
            int ni = 0;   // new array index

            while (i < indx) {
                newArr[ni++] = arr[i++];
            }
            newArr[ni++] = ele;

            while (i < size()) {
                newArr[ni++] = arr[i++];
            }

            this.indx++;
            arr = newArr;
            return;
        }

        for(int i = size()-1;i>=indx;i--){
            arr[i+1] = arr[i];
        }

        arr[indx] = ele;
        this.indx++;

    }

    public E set(int indx, E ele)
    {
        if(indx<0 || indx>=size())
            throw new UserIndexOutOfBoundsException("index "+ indx + "out of bounds exception");

        E temp = arr[indx];
        arr[indx] = ele;
        return temp;
    }

    public void trimToSize(){
        if(arr.length == size()){
            return ;
        }

        E[]newArr = (E[]) new Object[size()];

        for(int i =0;i<size();i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public void ensureCapacity(int cap){
        if(arr.length>=cap) return ;

        E[] newArr = (E[]) new Object[cap];

        for(int i =0;i<size();i++){
            newArr[i] = this.arr[i];
        }
    }

@Override
public Object clone() throws CloneNotSupportedException{
        return super.clone();
}

public Object[] toArray(){
        Object[] newArr = new Object[size()];

        for(int i =0;i<size();i++){
            newArr[i] = this.arr[i];
        }

        return newArr;
}


public E get (int indx){
        if(indx<0 || indx>=size())
            throw new UserIndexOutOfBoundsException("index out of bounds exception");
        return arr[indx];
    }


    @Override
    public int hashCode(){
        int i =0;
        int hashCode = 1;
        for(E ele : this.arr){
            hashCode = ele.hashCode();
            if(++i==size()) break;
        }
        return hashCode;
    }


    public boolean add(E ele) {
        if (indx == arr.length) {
            int newCap = newCapacity(arr.length);
            E[] newArr = (E[]) new Object[newCap];
            int i = 0;
            for (E ele1 : arr) {
                newArr[i++] = ele1;
            }
            arr = newArr;
        }
        arr[indx++] = ele;
        return true;
    }


    private int newCapacity(int oldCap) {
        return (int) (oldCap * 1.5);
    }


    public int size() {
        return indx;
    }


    public boolean isEmpty() {
        return indx == 0;
    }


    public E getFirst() {
        if (size() == 0) {
            throw new UserNoSuchElementException();
        }
        return arr[0];
    }


    public E getLast() {
        if (size() == 0) throw new UserNoSuchElementException();
        return arr[indx - 1];
    }


    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size(); i++) {
                if (arr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size(); i++) {
                if (o.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size(); i++) {
                if (arr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size() - 1; i >= 0; i--) {
                if (o.equals(arr[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    public E removeLast() {
        return remove(size() - 1);
    }

    public E removeFirst() {
        return remove(0);
    }

    public E remove(int indx) {
        if (indx < 0 || indx >= size()) throw new UserIndexOutOfBoundsException("array index out of bounds exception");
        E temp = arr[indx];
        for (int i = indx + 1; i <= size() - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size() - 1] = null;
        this.indx--;
        return temp;
    }

    public void addFirst(E ele) {
        add(0, ele);
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }



}

class DriverExampleArrayList {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());


        UserArrayList<Integer> list1 = new UserArrayList<>();
        System.out.println(list1.isEmpty());

        list1.add(10);
        list1.add(20);
        list.add(30);

        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.getFirst());
    }
}

