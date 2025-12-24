package PractArray31;

import java.util.Arrays;

public class ArrayRotation
{
    static void main(String[] args) {
// shifting arr elements to left by 1 - left rotation
        
     int []arr = { 10,20,30,40};
             System.out.println("bfore ROTATE AR" + Arrays.toString(arr));

    leftRotateArr(arr);
        System.out.println("AFTER LEFT ROTATE AR" + Arrays.toString(arr));
//    RightRotateArr(arr);
//        System.out.println("AFTER RIGHT ROTATE AR" + Arrays.toString(arr));



//    private static void leftRotateArr(int[] arr) {
//
//        int temp = arr[0];
//        for(int i =1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//
//        arr[arr.length-1] = temp;
    }


        private static void leftRotateArr(int[] arr) {
        int temp = arr[0];
        for(int i =0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;
    }

    private static void RightRotateArr(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
