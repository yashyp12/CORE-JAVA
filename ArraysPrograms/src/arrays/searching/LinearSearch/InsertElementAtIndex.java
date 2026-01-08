package arrays.searching.LinearSearch;

import java.util.Arrays;

public class InsertElementAtIndex {

    static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(insertElement(arr,8,20)));
    }

    static int[] insertElement(int[] arr, int index, int ele) {
        if (index < 0 || index > arr.length) return arr;
        int[] ans = new int[arr.length + 1];

        for (int i = 0; i < ans.length; i++) {
            if (i < index) {
                ans[i] = arr[i];
            } else if (i == index) {
                ans[i] = ele;
            } else {
                ans[i] = arr[i - 1];
            }
        }
        return ans;
    }
}