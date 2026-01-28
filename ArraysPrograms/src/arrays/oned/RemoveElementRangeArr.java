package arrays.oned;
import java.util.Arrays;
//remove elements from givrn range

public class RemoveElementRangeArr {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        removeElementRange(arr, 3, 4);
    }

    private static void removeElementRange(int[] arr, int start, int end) {

        if (start < 0 || end > arr.length || start > end) return;
        int[] result = new int[arr.length - (end - start + 1)];
        int indx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < start || i > end) {
                result[indx++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));

    }

}
