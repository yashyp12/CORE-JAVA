import java.util.Arrays;

class cumulativSum {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7 };

        prefixSum1(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void prefixSum1(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

}