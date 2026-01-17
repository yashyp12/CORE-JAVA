package arrays.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//https://youtu.be/W9QJ8HaRvJQ?si=ns9xlg9y1ZbYGIJ6&t=5063
public class FirstLastPosition {

    static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};

        //we just wanted to find the firs occurence and the last occurence of the target
        //we are running the binary search twice on array  once left ->left occurence once right ->last occurence
        // if the target == mid then if we want first then we search for left side if last occurence then we search for the right side of the array


        int[] ans = searchRange(arr, 8);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1}; // if not found return -1 both {first occurence , lasst occurecbne}

        ans[0] = search(nums, target, true); //now take the left occuence firsty
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);    //take the last occurecn from the right of the array which will be right

        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //means now the potential ans we found which is -> middle == target
                // now we will check if we want the first occurence then end = mid-1
                // if we want the last occurenc which will be on the right side then the start  = mid + 1;
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
