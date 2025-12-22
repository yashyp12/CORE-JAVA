import java.util.Arrays;

public class diffArrEl {
    public static void main(String[] args) {

        int[] arr = { 5, 9, 14, 20 };
        diffArrEl1(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void diffArrEl1(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] - arr[i - 1];
        }

    }
}
