package PractArray31;

import java.util.Arrays;

public class LeftRotation {

    static void main(String[] args) {

        int[]arr = { 10,20,30,40};
        leftRotate(arr);
    }

    private static void leftRotate(int[] arr) {
        int temp = arr[0];

        for(int i =1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        System.out.println("updated array is " + Arrays.toString(arr));
    }
}
