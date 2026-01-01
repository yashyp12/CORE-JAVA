package arrays.oned;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArr {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateAntiClockwise(arr, k);
    }

    static void rotateAntiClockwise(int[] arr, int rotation) {
        for (int i = 1; i <=rotation; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("rotated to clockwise arr " + Arrays.toString(arr));
    }
}
