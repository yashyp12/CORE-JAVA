import java.util.Arrays;

class prefixSum {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8 };

        prefixSum1(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void prefixSum1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

}