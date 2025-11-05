package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<> // Parent  and araylist is a child
//        ArrayList Parent  and araylist is a child
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(12);
        list2.add(24);
        list2.add(35);
        list2.add(256);

        System.out.println(list);
        System.out.println(list2);
    }
}
