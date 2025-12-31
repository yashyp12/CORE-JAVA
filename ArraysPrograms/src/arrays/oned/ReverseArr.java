package arrays.oned;

import java.util.Arrays;

public class ReverseArr {
    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        reverse2(arr);
    }

    static void reverse(int[] arr) {
//        int[] revarr = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            revarr[arr.length-1-i] = arr[i];
//         }
//        System.out.println("Array reversed " + Arrays.toString(revarr));
    }


    //    efficinet approach o(1) space complexity
    static void reverse2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Array reversed " + Arrays.toString(arr));
    }
}