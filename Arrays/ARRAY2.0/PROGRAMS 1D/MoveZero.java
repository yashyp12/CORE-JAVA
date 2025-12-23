import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        // MOVE ALL ZEROS TO THE END
        // k - position of the non zero elements
        // if found non zero increment it

        int[] arr = { 1, 0, 3, 0, 5, 0, 7 };

        int k = 0;

        System.out.println("before update " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            } else {
                continue;
            }
        }

        // now k has position of non zero
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }

        // final arry
        System.out.println("after updation " + Arrays.toString(arr));
    }
}
