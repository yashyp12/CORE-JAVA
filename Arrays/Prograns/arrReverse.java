import java.util.Arrays;

public class arrReverse {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 9, 7, 8 };
        // swap first the array
        RevArr(arr);
        System.out.println("after reversing the array " + Arrays.toString(arr));
    }

    static void RevArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap1(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap1(int[] arr, int index1, int index2) {
        // swap first
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
