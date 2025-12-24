package PractArray31;

import java.util.Arrays;

public class MoveZero {

    static void main(String[] args) {

    int []arr = { 1,0,3,0,5};
    nonZeroMove(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void nonZeroMove(int[] arr) {
     int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        // now add 0 at th end
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

}
