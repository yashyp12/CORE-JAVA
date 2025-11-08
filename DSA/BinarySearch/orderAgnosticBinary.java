package DSA.BinarySearch;

public class orderAgnosticBinary {
//    wht if we dont know whether the array is sroted or not sorted

    /* orderAgnosticBinary Search

HOW TO FIND IN WHICH ORDER THE ARRAY IS SORTED ?

     */

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int ans = orderAgnosticBinary21(arr,8);
        System.out.println(ans);
    }

    static int orderAgnosticBinary21(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//       find whether the array is sorted in ascending or descendding

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

//           common for both asc and desc
            if (arr[mid] == target) {
                return mid;
            }

//           this is for asc

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}