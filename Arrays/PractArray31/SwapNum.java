package PractArray31;

import java.util.Arrays;

public class SwapNum {

    public static void main(String[] args) {

        int[] arr = { 9, 8, 7, 4 };
        System.out.println("before reverser " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
