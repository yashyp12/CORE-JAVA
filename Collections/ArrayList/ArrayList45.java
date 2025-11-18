package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayList45 {

    static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(5);

        System.out.println(list);


        Collection<Integer> list2 = new ArrayList<>();
        list2.add(43);
        System.out.println(list2);


        LinkedList <Integer>list3 = new LinkedList<>();
        list3.add(23);
        list3.getFirst();
     }
}
