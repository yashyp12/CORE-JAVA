package Collections.ListInterface.ArrayList2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(45);
        list.add(59);
         System.out.println("before removal " + list.size());
        list.remove(2);
        System.out.println(list.get(2));

        System.out.println(list.size());

        System.out.println("before adding " + list);
//to add on the particular index
       list.add(2,56);
        System.out.println("after adding " + list);

//        to replace elemtn on the index
        list.set(0,25);
        System.out.println("after setting an element " + list);


//        setting initial capasity of arrayLists
//        in the below lsit 2 till the 1000 array wil not resize
        // when we addd 10001 new elemetn it will resize the array
        ArrayList<Integer> list2 = new ArrayList<>(1000);


//        for(int i =0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        for(int x : list){
//            System.out.println(x);
//        }

//        checking for the existens
//        System.out.println(list.contains(50));










    }
}
