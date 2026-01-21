package arrays.searching.BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/
//1095

//
public class SearchInMountain {

    static void main(String[] args) {

        int[]arr = {1,2,3,4,5,3,1};
        System.out.println(search(arr,3));
    }

    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     * public int get(int index) {}
     * public int length() {}
     * }
     */


    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        //we are usign the orderAgnostic binary searc becasue we dont know whether the array is sorted asc or  desc so
        int firstTry = orderAgnostic(arr,target,0,peak); // it will return the index of the element found on the position

        //searched in the lhs first halve from the peak bcz we need to find in the asc part so
        if (firstTry != -1) {
            return firstTry;
        }
        //now trying to search in the seconds halve

        return orderAgnostic(arr,target,peak+1, arr.length-1);

    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
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
        return start; // it can be end also
    }


}
