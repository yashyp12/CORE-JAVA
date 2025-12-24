import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        // MOVE ALL ZEROS TO THE END
        // k - position of the non zero elements
        // if found non zero increment it

        int[] arr = { 1, 0, 3, 0, 4, 0 };
        System.out.println("ARRAY BEFORE SHIFTING " + Arrays.toString(arr));

        nonZeroMove(arr);
        System.out.println("ARRAY AFTRE SHIFTING " + Arrays.toString(arr));
    }

    static void nonZeroMove(int[] arr) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        // now add 0 at th end
        for (int i = k; i < arr.length; i++) {

            arr[i] = 0;
        }

    }
}
