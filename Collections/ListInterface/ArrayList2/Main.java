package Collections.ListInterface.ArrayList2;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(45);
        list.add(59);
        list.add(45);

        // new element are added in the last

//        System.out.println(list);


//      get the capasity of the arrylist using reflection

//        List<String> list1 = new ArrayList<>();
//        System.out.println(list1.getClass().getName());
//

/*Arrays.asList() — Simple Explanation

Think of it like this:
It doesn’t create a new independent ArrayList,
it just wraps your existing array inside a fixed-size list view.


⚠️ Key Point: It’s a Fixed-size List

You cannot add or remove elements.
Because this list is just a view of the array, not a true dynamic list.
 */


//List<Integer>listx = new ArrayList<>();
//        System.out.println(listx.add(25));
////       listx.ensureCapacity(100); cannot accces because i snot in list
//        System.out.println(listx);


//         System.out.println("before removal " + list.size());


//        list.remove(2);
//        System.out.println(list.get(2));

//        System.out.println(list.size());

//        System.out.println("before adding " + list);
//to add on the particular index
//       list.add(2,56);
//        System.out.println("after adding " + list);

//        to replace elemtn on the index
//        list.set(0,25);
//        System.out.println("after setting an element " + list);


//        setting initial capasity of arrayLists
//        in the below lsit 2 till the 1000 array wil not resize
        // when we addd 10001 new elemetn it will resize the array
//        ArrayList<Integer> list2 = new ArrayList<>(1000);


//        for(int i =0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        for(int x : list){
//            System.out.println(x);
//        }

//        checking for the existens
//        System.out.println(list.contains(50));


//        how to print  capacity of arrayList


//        Arrays .asList
//Arrays.asList() is a method from the Arrays class (a utility class).
//It takes an array and wraps it in a fixed-size List view


        //✅ You can read and modify elements (like set()),
        //
        //❌ But you cannot add or remove elements.
//it does not give new list it jsut giving us the view of our array
//        String[] arr = {"a", "b", "c"};
//        List<String> listy = Arrays.asList(arr);
////        listy.add("x"); // not supproted
//        listy.set(0, "as"); // worked
//        System.out.println(listy);


        //LIST OF method - a static factory method introduced in Java 9.
//        a static factory method introduced in Java 9.
//        List<String>names = List.of("Yash","patil");
////        names.add("ravi"); immutable obj is not modifed
//        List<Integer> listk = new ArrayList<>();
//        listk.add(1);
//        listk.add(4);
//        listk.add(6);
//        System.out.println(listk);
//        List<Integer> list4 = List.of(4,5,6,7);
//        listk.addAll(list4);
//        System.out.println(listk);
//
//
//


//        adding and removing
        List<Integer> listm = new ArrayList<>();
        listm.add(5);
        listm.add(6);
        listm.add(3);
        listm.add(4);


//         sorting the arraylist usign collections utility lcas
          System.out.println(listm);
//         Collections.sort(listm);
         listm.sort(null); // its taking the comparator
        System.out.println(listm);










//

//        coonverting list to array
//      listm.toArray(new Integer[0]); //it will create new array

//Object []arr = list.toArray();
//        System.out.println(Arrays.toString(arr));

//        List<String> names = List.of("Yash", "Raj", "Amit");
//        System.out.println(names);
//        now let conver it to normal strign array
//        Every list in Java has a method called toArray().
//This method takes your list and turns it into an array.

//Object[] arr = names.toArray();  // returns object
//        // here we are creating an Array of object
//        System.out.println(Arrays.toString(arr)); // it will give object

        // now here is the array is an object array notString[]

//        We tell Java what type of array we want by passing an empty array of that type:

//String[]arr1 = names.toArray(new String[0]); // we write String[0 ] -“Hey Java, I want an array of type String —
////you decide the size yourself.”
//        System.out.println(Arrays.toString(arr1));

// int[]arr4 = names.toArray(new int[0]); fails because teh toArray only works with objects










//



//        System.out.println(listm);
//        listm.remove(1);
//        System.out.println(listm);

//        string list
//        List<String> fruits = new ArrayList<>();
//        fruits.add("APPLE00");
//        fruits.add("BANANA");
//        fruits.add("CHIKU");
//
//        System.out.println(fruits);
////        fruits.remove("CHIKU");
//        fruits.remove(0);
//
//        fruits.remove(Integer.valueOf(1)); //we are passing the object to it here the 1 is object so it will remove thei first occurence
//        System.out.println(fruits);

//        Integer a = Integer.valueOf(34) ;
//        int x =  a.intValue();

    }
}
