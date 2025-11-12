package MULTIDIMENSIONAL_ARRAY;

import java.util.Arrays;

public class multi2dArrRev {
    public static void main(String[] args) {
        
        int[][]arr = {
                {21,65,86}, // each one is an array
                {23,56,77},
                {76,45,65}
        };

        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

         System.out.println(Arrays.deepToString(arr));


        //  pritning array of each row
         for(int[]arr1 : arr){
            System.out.println(Arrays.toString(arr1));
         }
    }
}
