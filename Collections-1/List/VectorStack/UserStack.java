package List.VectorStack;

class UserEmptyStackException extends RuntimeException{
    UserEmptyStackException(){
        super();
    }
}

public class UserStack<E>{
private E[] arr;
final private int INITIAL_CAPACITY = 10;
private int indx;  //size

    public UserStack(){
        arr = (E[])new Object[INITIAL_CAPACITY];
    }

    @Override
    public String toString(){
       if(indx==0) return "[]";
       String op = "[";
       for(int i =0;i<indx;i++){
           op+=arr[i]+", ";
       }
       return op+=arr[indx-1]+"]";
    }

    public E push(E ele){
        if(indx==arr.length){
            E[] newArr = (E[]) new Object[arr.length*2];
            for(int i =0;i<arr.length;i++){
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }

        arr[indx++] = ele;
        return ele;
    }


    public int capacity(){
        return this.arr.length;
    }

    public E peek(){
        if(indx==0) throw new UserEmptyStackException();
        return arr[indx-1];
    }

    public E pop(){
        if(indx==0) throw new UserEmptyStackException();

        E temp = arr[indx-1];
        arr[indx-1] = null;
        indx--;
        return temp;
    }

    public boolean empty(){
        return indx==0;
    }

    public int search(Object obj){
        E search = (E) obj;

        int offset =1;

        for(int i =indx-1;i>=0;i--){
            if(arr[i].equals(search)) return offset;
        }

        return -1;
    }


}

