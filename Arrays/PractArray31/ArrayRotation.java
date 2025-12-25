package PractArray31;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation
{
    static void main(String[] args) {
// shifting arr elements to left by 1 - left rotation
        
     int []arr = { 10,20,30,40};
//             System.out.println("bfore ROTATE AR" + Arrays.toString(arr));

//    leftRotateArr(arr);
//        System.out.println("AFTER LEFT ROTATE AR" + Arrays.toString(arr));
//    RightRotateArr(arr);
//        System.out.println("AFTER RIGHT ROTATE AR" + Arrays.toString(arr));

//        k times rotation of arrya by left
        System.out.println("left rotation array by k");
        KTimesRotateLeft(arr,new Scanner(System.in).nextInt());
        System.out.println("updated array is after k left rotation" + Arrays.toString(arr));


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

//    array k times rotation
    private static void KTimesRotateLeft(int [] arr , int k){
        int n = arr.length;
        // handles the bigger K - if the k is too big then it will return 0 simply , otherwise return the same num
         k = k%n;

         for(int i =0;i<k;i++){
             leftRotateArr(arr);
         }

    }
}
