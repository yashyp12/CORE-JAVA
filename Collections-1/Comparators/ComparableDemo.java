package Comparators;

import java.util.ArrayList;
import java.util.ListIterator;

public abstract class ComparableDemo {

    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
            System.out.println(list);
        }

        ListIterator<Integer> lt = list.listIterator();

        while (lt.hasNext()){
            if(lt.nextIndex()==list.size()/2) break;
            System.out.println(lt.next()+" ");
        }

        System.out.println("*************");
    }

}
