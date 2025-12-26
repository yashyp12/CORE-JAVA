package PractArray31;

import java.util.Arrays;
import java.util.Scanner;

public class K_RotationArr {

    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the value of K ");
        int k = new Scanner(System.in).nextInt();
        System.out.println("array before reverse " + Arrays.toString(arr));
        kReverse(arr, k);
        System.out.println("reversed array by k times " + Arrays.toString(arr));
    }

    static void kReverse(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handles the larger k
        //step 1 -> reverse the K elemetn first from the array
        //step 2 -> reverse the remaining n-K elemetn  from the array
        //step 3 -> reverse the entire arr elemetn from the array
        reverse(arr, 0, k - 1); // step 1
        reverse(arr, k, n - 1); // step 2
        reverse(arr, 0, n - 1); // step 3
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
