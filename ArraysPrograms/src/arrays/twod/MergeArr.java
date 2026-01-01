package arrays.twod;

import java.util.Arrays;

public class MergeArr {

//    merging the 2d array

    static void main(String[] args) {
//        char[][] arr = {{'a', 'b', 'c'},
//                {'d', 'e', 'f'}};
//        int size = 0;
//
//        for (char[] ch : arr) {
//            size += ch.length;
//        }
//        //make a new aray to tore all elements
//        char[] ch2 = new char[size];
//        //now add the elemnts to the new array
//        int i = 0;
//        for (char[] arr1 : arr) {
//            for (char ele : arr1) {
//                ch2[i++] = ele;
//            }
//        }
//        System.out.println(Arrays.toString(ch2));

        int []arr1 = {1,2,3,4};
        int []arr2 = {5,6,7,8};

        zigZagMerge(arr1,arr2);

    }

    static void zigZagMerge(int[] arr1, int[] arr2) {

        int[] zigZag = new int[arr1.length + arr2.length];

        for (int i = 0, index = 0; i < zigZag.length; i++) {
            if (i < arr1.length) {
                zigZag[index++] = arr1[i];
            }
            if (i < arr2.length) {
                zigZag[index++] = arr2[i];
            }
        }

        System.out.println(Arrays.toString(zigZag));


    }
}
