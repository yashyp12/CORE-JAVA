package arrays.oned;

import java.util.Arrays;

//even odd elements in arry , create sepearet array for even and odd
public class EvenOddArr {

    static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6}};

        evenOdd(arr);
    }


    static void evenOdd(int[][] arr) {
        int esize = 0;
        int osize = 0;

        for (int[] ele : arr) {
            for (int ele2 : ele) {
                if (ele2 % 2 == 0) {
                    esize++;
                } else {
                    osize++;
                }
            }
        }

        int[] earr = new int[esize];
        int[] oarr = new int[osize];
        int i = 0, j = 0;
        for (int[] ele : arr) {
            for (int ele2 : ele) {
                if (ele2 % 2 == 0) {
                    earr[i++] = ele2;
                } else {
                    oarr[j++] = ele2;
                }
            }
        }
        System.out.println(Arrays.toString(earr));
        System.out.println(Arrays.toString(oarr));
    }
}