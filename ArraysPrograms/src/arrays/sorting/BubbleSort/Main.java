package BubbleSort;

import java.util.Arrays;

//time complexity = O(1)
//https://youtu.be/F5MZyqRp_IM?si=2skX2Rb2nhFNFhg3
public class Main {

    static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
//        bubble(arr);
//        selection(arr);

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        //if no swap is occured means our array is sorted
        boolean swapped;
//run the steps n -1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max item will comes at teh last respct index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is samller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            //if we not swapped for partiuclar value of i, it means the array is sorted
            //hence stop the program
            if (!swapped) {
                break;
            }
        }
    }


    //select the element and put it into a correct position
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in remaining array and swap with correct index

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > -0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }


}
