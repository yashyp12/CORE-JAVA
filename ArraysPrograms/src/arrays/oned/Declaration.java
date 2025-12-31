package arrays.oned;

import java.util.Arrays;
import java.util.Scanner;

public class Declaration {

    static void main(String[] args) {


//        reverse printing of array
//        int []arr1 = {10,20,30,40};
//        for(int i = arr1.length-1;i>=0;i--){
//            System.out.println(arr1[i]);
//        }


//        2d array declaration
//        int[][]arr = new int[3][3];
//        for(int i =0;i<arr.length;i++)
//        {
//            for(int j =0;j<arr[i].length;j++){
//                arr[i][j] = new Scanner(System.in).nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));


//        2d array
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };
//        reversing 2d array

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }


    }
}
