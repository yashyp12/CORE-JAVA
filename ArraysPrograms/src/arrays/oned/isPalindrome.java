package arrays.oned;

public class isPalindrome {

    static void main() {
        int[] arr = {1, 2, 3,4, 2, 1};
        isarrPalin(arr);
    }

    static void isarrPalin(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                return;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);


    }

}