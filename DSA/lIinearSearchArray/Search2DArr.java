package DSA.lIinearSearchArray;

import java.util.Arrays;

public class Search2DArr {

    /*
    for finding max val we can take MIN VAL
    nd for findngf min val we can take MAX VAL
     */

   public static void main(String[] args) {
       int[][] arr ={
               {23,4,1},
               {18,12,3,9},
               {78,90,36,54},
               {18,12}
       };

//       System.out.println();
//       System.out.println(arr[0].length);
//       System.out.println(Arrays.deepToString(arr));

    int target = 54;
    int[] ans = search2DArr(arr,target); // format of return val(w,col
//       System.out.println(search2DArr(arr,target));
//       System.out.println(Arrays.toString(ans));

       System.out.println(max2DArr(arr));


    }

//    searching in 2d array
    static int[] search2DArr(int [][] arr,int target){
       for(int row =0; row<arr.length; row++){
           for(int col =0; col<arr[row].length; col++){
               if(arr[row][col]==target){
                   return new int[]{row,col};
               }
           }
       }
       return new int[]{-1,-1};

    }


//    maximum in the 2darray
    static int max2DArr(int[][] arr){
       int max = Integer.MIN_VALUE;

//       for(int row =0;row<arr.length; row++){
//           for(int col=0; col<arr[row].length; col++){
//               if(arr[row][col] >max){
//                   max = arr[row][col];
//               }
//           }
//       }

        //enhanced for loop
        // here we are iterating over array bcz every row contains an array
        for(int [] ints: arr){
            for(int element : ints){
                if(element >max){
                    max = element;
                }
            }
        }
       return max;
    }
}
