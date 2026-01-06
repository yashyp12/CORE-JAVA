package arrays.searching.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {

    static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        System.out.println(linearSearch(arr, 10));
//        int[] ans = removeIndex(arr, 2);
        int[] ans = removeElement(arr, 20);
        System.out.println(Arrays.toString(ans));

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int[] removeIndex(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            int[] ans = new int[arr.length - 1];

            for (int i = 0; i < arr.length; i++) {
                if (i < index) {
                    ans[i] = arr[i];
                } else if (i > index) {
                    ans[i - 1] = arr[i];
                }
            }

            return ans;
        } else {
            return arr;
        }


    }

//    static int[] removeElement(int[] arr, int ele) {
//
//        // remove the element from the index for that we need to find first the index of that element
//        int i = 0;
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] == ele) {
//                break;
//            }
//        }
////            check whether the index is valid or not
//            if (i<0 || i > arr.length) return arr;
//
//            int[] ans = new int[arr.length-1];
//
////            now putting the elemetn in the new aray
//            for (int j = 0; j < arr.length; j++) {
//                if (j < i) {
//                    ans[j] = arr[j];
//                } else if (j > i) {
//                    ans[j - 1] = arr[j];
//                }
//            }
//
//            return ans;
//        }
//    }
//
    static int[] removeElement1(int[] arr, int ele) {

//        first find the index of the element to remove
        int i = 0;
        for(i =0;i<arr.length;i++){
            if(arr[i]==ele)break;
        }

//        now we have an index so validate it
        if(i<0 || i>arr.length-1) return arr;

//        now create an another array with less than 1 size
        int[]ans = new int[arr.length-1];

//        now iterate over the array

        for(int j=0;j<arr.length;j++){
            if(j<i){
                ans[j] = arr[j];
            }else if(j>i){
                ans[j-1] = arr[j];
            }
        }

        return ans;
        }
    }



