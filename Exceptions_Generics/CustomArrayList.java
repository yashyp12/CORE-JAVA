package Exceptions_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

//        ArrayList list = new ArrayList();
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println(arr);
//        System.out.println(list);

//    arraylist wihtout using generics
        ArrayList list = new ArrayList();
//        list.add(45);
//        list.get(0);
//        list.set(1,56);
//        list.size();
//        list.isEmpty();

        private int[] data;
        private static int DEFAULT_SIZE = 10;
        private int size =0; //  size is also working as an index val

    public CustomArrayList( ) {
        this.data = new int[DEFAULT_SIZE];
    }


    public int get(int index){
        return data[index];
    }

    public void set(int index,int value){
        data[index] = value;
    }

//    add method - if the size of arraylsit is full its resize it
    public void add(int num){
        if(isFull()){
            resize();
        }
//        insert at 0 index size will be 1
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int[data.length*2];

        //copy the current items in teh new array
        for(int i =0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

//    size is also working as an index val
//    i am not removing the data just reducing the size
    public int remove(){
        int remove = data[--size];
        return remove;
    }

    private boolean isFull(){
//        checkingwhther array is full or not
        return size==data.length;
    }

//    override tos tring
    @Override
    public String toString(){
        return "CustomArrylist{" +
                "data" + Arrays.toString(data) +
                "size" + size +
                '}';
    }


    public static void main(String[] args) {
//        aRRAYLIST = NEW aRRAYLIST();
//        INSTEAD OF THAT ONE WE ARE SAYING
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println( list.size);
//        we are printing our custom class
        System.out.println(list);

        for(int i =0; i<14; i++){
        list.add(2*i);
        }
//        it wil show size 17 only becasue the actual size is what you insert
        System.out.println(list);

//        this internal array will make sure that we will only add integer type into it
     // HER ETEH Integer is a generic and we can only add classes in the generics
        ArrayList<Integer> list1 = new ArrayList<>();

    }

    
}
