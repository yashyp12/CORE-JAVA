package BubbleSort;

import java.util.Arrays;

//https://youtu.be/F5MZyqRp_IM?si=2skX2Rb2nhFNFhg3
public class Main {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
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
            if(!swapped){
                break;
            }
        }
    }
}
