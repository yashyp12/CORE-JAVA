package DSA.lIinearSearchArray;

import java.util.Arrays;
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 5, 8, 4, 5, -16, -65};
        int target = new Scanner(System.in).nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //search in the array
    // return the index if item is found otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run fo loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
//        this lne will execute if none of the return statement
        return -1;
    }
}