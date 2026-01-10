package arrays.twod;

import java.util.Arrays;

public class SearchIn2d {

    static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {10, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12,101}
        };
        int target = 12;
        int[] ans = search2dArr(arr, 56);
        System.out.println(Arrays.toString(ans));

        System.out.println(max2d(arr));
    }

    static int[] search2dArr(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

      static int max2d(int[][] arr ) {
        int max = Integer.MIN_VALUE;

          for (int[] ints : arr) {
              for (int anInt : ints) {
                  if (anInt > max) {
                      max = anInt;
                  }
              }
          }
       return max;
    }
}
