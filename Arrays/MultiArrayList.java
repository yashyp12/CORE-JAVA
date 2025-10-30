import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //multi dimensional array  - arraylist of arraylist of type integer
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//A multi-dimensional ArrayList is an ArrayList that contains other ArrayLists as its elements, creating a nested structure similar to a multi-dimensional array
//        initialsing it - so by default value of every single index is null
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            System.out.println("arraylist has been initialised");
        }

//        add elements into it
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    list.get(i).add(in.nextInt());
//we are basically first fetching index of i arraylist then addding new value into it
//                    [[1, 2, 3], [6, 5, 3], [2, 5, 6]]

                }
                System.out.println();
            }
        System.out.print(list);
    }
}
