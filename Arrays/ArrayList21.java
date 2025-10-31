import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayList21 {


    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>(10);

//        System.out.println(arr);
        list.add(23);
        System.out.println(list);

//        we can add elemtns in one line using ass list using arrays static helper method
//        ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(2,5,6));
//        System.out.println(list);
//        list.add(45);
//        System.out.println(list);
//        System.out.println(list.size());
//
//

//        IN ARAY LIST W CANT GO TILL IT SIZE BECAUSE ARRAYLIST IS DYNAMIC IN SIZE
        for(int i=0; i<5;i++){
            list.add(new Scanner(System.in).nextInt());
        }
        System.out.println("before set "  + list);

//        to add new element o index 1  add(index,element)
        list.add(1,99);

        System.out.println("after add " + list);

//        replace last element with 100
        list.set(list.size()-1,100);

         System.out.println("after set " + list);

    }
}
