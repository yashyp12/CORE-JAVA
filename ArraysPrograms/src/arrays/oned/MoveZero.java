package arrays.oned;

import java.lang.reflect.Array;
import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/
public class MoveZero {

    static void main(String[] args) {
        int[]arr = {1,2,0,0,4};
        moveZeroLast(arr);
    }

    static void moveZeroLast(int[]arr){

//        step 1- k maintans the non zero element in arr
        // step 2- when we got the non zro element just increment the k ++

        int k =0; // maintains the non zero position


        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++] = arr[i];
            }
        }

        for(int i =k;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println("Non zero updated arrya"+Arrays.toString(arr));

    }
}



