package Exceptions_Generics;
//https://docs.oracle.com/javase/tutorial/java/generics/types.html
import java.util.ArrayList;
import java.util.Arrays;


//wildcard example
//public void getList(List<Number> list){
//// do somehting
//// here we can only pass numbeer typep
//// if we want subclassses as well then ddo add ? extends Number class
//}


//we ca ad wildcards like extends number to restrict the type
// means now we can ad in array only the classes that are numbers
// or the subclasses of the numbers
// here t should be number and its subclasses
public class CustomGenericsArrayList <T extends Number>{

    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //  size is also working as an index val

    public CustomGenericsArrayList() {
//        this will show error because compiler and byte code dont hav
        // any idea about the T
        // WE CANNOT CREATE AN INSTANCE OF TYPE PARAMETER
        this.data = new Object[DEFAULT_SIZE];
    }

    public T get(int index){
        return (T) data[index];
    }


    //    add method - if the size of arraylsit is full its resize it
    public void add(T num) {
        if (isFull()) {
            resize();
        }
//        insert at 0 index size will be 1
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current items in teh new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    //    size is also working as an index val
//    i am not removing the data just reducing the size
    public T remove() {
        T remove = (T) (data[--size]);
        return remove;
    }

    private boolean isFull() {
//        checkingwhther array is full or not
        return size == data.length;
    }

    //    override tos tring
    @Override
    public String toString() {
        return "CustomArrylist{" +
                "data" + Arrays.toString(data) +
                "size" + size +
                '}';
    }


    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(3);

        System.out.println(list);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
//        it wil show size 17 only becasue the actual size is what you insert
        System.out.println(list);

//        this internal array will make sure that we will only add integer type into it
        // HER ETEH Integer is a generic and we can only add classes in the generics
        ArrayList<Integer> list1 = new ArrayList<>();


        CustomGenericsArrayList<Integer> list3 = new CustomGenericsArrayList<>();
//        list3.add(2);

        for(int i =0; i<14; i++){
            list3.add(2+i);
        }
//inetnally array is also using Object
        System.out.println("list3 "  + list3);
    }
}
