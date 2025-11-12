package Collections.ArrayList;

import java.util.*;

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

    List<Integer> list3 = new LinkedList<>();



        list2.add(34);
        list2.add(56);
        list2.add(65);
        list2.add(66);


        list.add(23);
        list.add(54);
        list.add(99);
        list.add(55);

        list.add(3,12);


              System.out.print(list);
//        list.remove(0);
//        list.remove(Integer.valueOf(2));
//        list.addAll(list2);
//        System.out.println("after adding list2 " + list);
//        list.removeAll(list2);
//        System.out.print("after removeall " + list);
//    list.clear();
//
//        System.out.println(list.contains(4));
//        System.out.println(list.indexOf(99)); // return -1 if not found
//        System.out.println(list.lastIndexOf(55));


//        converting an ArrayList to an array usingn toArray()
//        Object[]arr = list.toArray();
//        System.out.println(Arrays.toString(arr));
//
//
//        Collections.sort(list);
//        System.out.println();
//        System.out.println("after sorting " + list);
//        list.sort(Collections.reverseOrder());
//        System.out.println("sorting in an ascending order " + list);



//        using the substring ()
/*
he method signature is subList(int fromIndex, int toIndex).
fromIndex (1) is inclusive: The elements starting from index 1 are included in the sublist.
toIndex (3) is exclusive: The elements up to, but not including, index 3 are in the sublist.
 */

        System.out.println(list.subList(1,3) );

        list.ensureCapacity(100);
//        shrinking the capsit
//        list.trimToSize( );

        System.out.println(Collections.frequency(list,54));// returns how many times elemetn are in the list
        System.out.println(Collections.max(list));
//        System.out.println(list);
//        list.set(0, 65);

//        merging of t wo arrays uinsg addAll()
//        list.addAll(list2);


//        converting an arraList to array using toArray()



//         System.out.println( list.contains(3) );

//        for(int i =0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
////        for each enhacned version
//        for(Integer i : list){
//            System.out.println(i);
//        }
    }
}
