package arrays.searching.LinearSearch;

import java.util.Arrays;

public class findFrequency {

    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 10, 20, 30};

        /*
         -1 = element is duplicated
         if unqiue - 0
         >unique - appears more than 1
         */

        int [] ans = freqOfArr(arr);
        System.out.println(Arrays.toString(ans));



    }


    static int[] freqOfArr(int[] arr) {
        int[] freq = new int[arr.length ];

        // iterate over the array

        for (int i = 0; i <arr.length; i++) {
            if (freq[i] == -1) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = -1;
                    count++;
                }
            }
            freq[i] = count;
        }
        return freq;
    }
}
