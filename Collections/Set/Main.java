package Collections.Set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        hashset does not follow the insertion order thats why fast
        HashSet<Integer> set2 = new HashSet<>();

        set2.add(56);
        set2.add(34);
        set2.add(23);
        set2.add(12);


        System.out.println(set2 + "storing in the hashset inetrface");

//        only themain diff is linkedhashset follows the insertion sort O(1)
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();

        set3.add(56);
        set3.add(34);
        set3.add(23);
        set3.add(12);
        System.out.println(set2 + "storing in the linkedhash set inetrface");


//        sortedSet -> treeset - stores elements in sorted order ,
//        Summary of the Hierarchy
//Here is how the hierarchy works:
//Interface: Set
//|
//Interface: SortedSet
//|
//Interface: NavigableSet
//|
//Class: TreeSet (Implements all the above)
/*The SortedSet interface extends the basic Set interface and adds methods specific to ordering, such as: */
        SortedSet<Integer> setx = new TreeSet<>();


        setx.add(2);
        setx.add(4);
        setx.add(6);
        setx.add(1);
        setx.add(7);
        System.out.println(setx); // sorted list


    }
}
