package arrays.oned;

import java.util.Arrays;

public class Test {
    static void main(String[] args) {
        int[]arr = {1,2,3};
        arrInt(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrInt(int []arr){
        arr[0] = 23;
        arr= new int[4];
    }
}
