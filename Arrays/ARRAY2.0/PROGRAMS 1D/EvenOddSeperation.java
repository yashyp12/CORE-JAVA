
import java.util.Arrays;

public class EvenOddSeperation {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 4, 7, 6 };
        evenOdd(arr);

        System.out.println("array after sorting eeven odd elements " + Arrays.toString(arr));
    }

    static void evenOdd(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0;

        // first pass copy all evn element to tempar

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[index++] = arr[i];
            }
        }

        // 2 pass copy all odd element to tempar

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[index++] = arr[i];
            }
        }

        // 3 - merge wiyth out arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

    }
}
