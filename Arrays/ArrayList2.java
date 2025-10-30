import java.util.ArrayList;


public class ArrayList2 {


    public static void main(String[] args) {
//        ARRAYLIST - - what you do when we dont know the size of the array , array has fixed size .
//- Array list is a part of collection
//Syntax -
//        ArrayList<Integer> list = new ArrayList<Integer>();
// generics - type of data which you can store in this list object
//        ArrayList<Integer> list = new ArrayList<>(10);
        // here we cannot pass primitves we need to pass wrapper class
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(34);
        list.add(54);
        list.add(343);
        list.add(234);
        list.add(54);
        list.add(54);
//        we can add as many we want
        // this calls internally own toString() method
//inital capacity does not matter
        System.out.println(list);
//        we can update also - 0 index wil update to 99
        list.set(0,99);

//        remove the elements on the specifc indexs
        list.remove(2);
//        System.out.println(list.contains(54));
        System.out.println(list);
    }
}
