package arrays.searching.BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/

//
public class SearchInMountain   {

    static void main(String[] args) {

    }

    /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */





//    public int search(int[]arr, int target){
//
//
//    }

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//
//    }

 static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //we are in the desc part of array so
                //this may be the ans ,bt look at left
                //this why end != mid-1;
                end = mid;
            } else {
                //we are in asc part of array
                start = mid + 1; //bcz we know tha mid+1 ele is greater than the mid ele
            }
        }

        return start; // it can be end a
    }

    static int binarySearchR(int[] arr, int start, int end, int target) {
//    directly check the element
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
