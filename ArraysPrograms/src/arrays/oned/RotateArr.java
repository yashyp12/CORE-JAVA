package arrays.oned;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArr {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
//        rotateAntiClockwise(arr, k);
        rotateClockwise(arr,k);
    }

    static void rotateAntiClockwise(int[] arr, int rotation) {
//        k % n removes unnecessary full rotations because rotating n times gives the same array.
        /*Rotating an array n times brings it back to the same array.
So anything more than n rotations is useless repetition. */
        rotation = rotation%arr.length;
        for (int i = 1; i <=rotation; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("rotated to clockwise arr " + Arrays.toString(arr));
    }

    static void rotateClockwise(int[]arr,int rotation){
        rotation = rotation%arr.length;

        for(int i =1;i<=rotation;i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println("rotated to Anticlockwise arr " + Arrays.toString(arr));

    }

}
