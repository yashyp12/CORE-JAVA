package arrays.oned;

import java.util.Arrays;

public class MaxElement {

    static void main(String[] args) {
        int[] arr = {12, 12, 12};
//        largestEl1(arr);
//        smallestEl1(arr);
        secondLargest(arr);
    }

    //find the first largest element from the array
    static void largestEl1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("Arrays 1st largest element " + max);
    }


    static void smallestEl1(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        System.out.println("Arrays 1st smallestt element " + min);
    }

    //
    static void secondLargest(int[] arr) {

        if(arr.length<2) System.out.println("second largest not found ");

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                if(max!=Integer.MIN_VALUE) found = true;
                max2 = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > max2) {
                max2 = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("second index   found" + max2);
        } else {
            System.out.println("not found ");
        }
    }
}