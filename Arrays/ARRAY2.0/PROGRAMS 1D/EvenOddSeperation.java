import java.util.Arrays;

public class EvenOddSeperation {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 4, 7, 6 };
        System.out.println("ARRAYS before SHIFTING Only even " + Arrays.toString(arr));

        evenOdd(arr);
        System.out.println("ARRAYS AFTER SHIFTING Only even " + Arrays.toString(arr));
    }

    static void evenOdd(int[] arr) {
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[e];
                arr[e] = arr[i];
                arr[i] = temp;
                e++;
            }
        }
    }
}
