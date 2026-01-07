package arrays.oned;

import java.util.Arrays;

//sum of elements, average of array elemtns ,
public class BasicArr {

    static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(sumOfArray(arr));
//        System.out.println(avgOfArray(arr));
//        sumOfEvenOdd(arr);
//        productOfArr(arr);
//        randFuncInit(arr);
//        charArrExam();

        int[] arr1 = {1, 2, 3, 4}, arr2 = {5, 6, 7};
        mergeUnsortedArr(arr1, arr2);

    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double avgOfArray(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    static void sumOfEvenOdd(int[] arr) {
        int EvenSum = 0;
        int OddSum = 0;
        for (int i : arr) {
            if ((i & 1) == 0) {
                EvenSum += i;
            } else {
                OddSum += i;
            }
        }
        System.out.println("SUM OF EVEN " + EvenSum);
        System.out.println("SUM OF Odd " + OddSum);
    }

    static void productOfArr(int[] arr) {
        long product = 1;
        for (int i : arr) {
            if (i != 0) product *= i;

        }
        System.out.println("Product of arr " + product);
    }

    static void charArrExam() {
        char[] arr = new char[26];
        System.out.println("before " + Arrays.toString(arr));
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            arr[ch - 65] = ch;
        }
        System.out.println("after " + Arrays.toString(arr));
    }

    //mergin 2 dif arryas - only unsorted approach
    static int[] mergeUnsortedArr(int[] arr1, int[] arr2) {
        /* approach - assume we have an 2 unsorted array
         - in which create an another one array of arr1+arr2 size
        - store the max - length of an array
        - iterate the aray till the max array length
        */
        int[] c = new int[arr1.length + arr2.length];
        int max = arr1.length < arr2.length ? arr2.length : arr1.length;

        for (int i = 0, ci = 0; i < max; i++) {
            if (i < arr1.length) c[ci++] = arr1[i];
            if (i < arr2.length) c[ci++] = arr2[i];
        }

        System.out.println("update c[] " + Arrays.toString(c));
        return c;
    }

    static void mergeSortedArrr(int[]arr1,int[]arr2){

    }


}
