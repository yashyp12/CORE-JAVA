package arrays.searching.BinarySearch;

// leeetcode 33
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 https://youtu.be/W9QJ8HaRvJQ?si=oqxvdYswrTPdO2Z0&t=10450
 */
/*
we are goign to follwo some of the approaches to solve this problme
1 rotated binary search - find the pivot element in array
pivot - from where the next num are ascendign in an array
- search in first halve binarySerach(0,pivot)
- otherwise search in the seconds halve binary(pivot,end)

wghen find that mid > mid + 1 - > its an pivot case 1 -> MID > MID +1
CASE 2 - MID < MID -1;
case 3 - START ELE >= MID
- BECASUE THE START IS COME BY ROTATED FROM LAST TO FIRST
- in case 3 all elements from mid will be smaleller than ht start element hence
we can ignore all of these elementes since we are ooking for the peak element so
end = mid -1

CASE 4 -
start elemetn <= mid element - mean first array is sorted


Q find the pivot

 */
public class RotatedBSearch {

   public static void main(String[] args) {
        int[] arr = {12,2,4,5,7,8,9,10};
//        System.out.println(findPivot(arr));
        System.out.println(search(arr, 5));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if we donthave an pivot , not found
        // it means the array is not rotated
        if (pivot == -1) {
            //now do binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if pivot is found , we have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        //if the target is greater tha the start elemetn ,
        // so now search space is getting reduces to the till the pivot -1
        //becase we know that all element after the pivot are actually smalelr than the start
        //so there is no point to search there

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // now at the end if our target is smalelr than the start , then it means
        // definetly i will be lie in the right halve means the search area
        // will become the pivto + 1 to the end because smalle element lies there only
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

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

// this will not work for the duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases we are going to follow to find the pivot element
// case 1
            //mid shouuld be less than end to avoid erors
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//            case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //case 3 - all the elements after the mid elemetns are going to be smalelr than start
            //so we need big element , so we can ignore the element after the mid ,
            //so end should be middle - 1 (no sense to  check smaller elemetn )
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                // now if false then if start < mid then its a possibility
                // taht the pivot is after the mid
                // if the mid was pivot iit was caught earlier conditions
                // so we can search in second part of the array
                start = mid + 1;
            }
        }
        return -1; // element not found
    }



// this will work for the duplicate values
    static int findPivotWithDup(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//            case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if elemetns at mid ,start ,end are equal then just skip the duplicated
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the dup

                //note what if thes eelements at start and end were the pivots
                //check if start is pivot
                if(arr[start]<arr[start +1]){
                    return start; }
                start++;

                //check whether the end is pivot or not
                if(arr[end]<arr[end-1]){
                    return end -1 ;
                }
                end --;
            }
            //left side is sorted ,so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[end] <arr[mid])){
              //check in the rhs
              start = mid +1;
            }else {
                //otherwise check in left
                end = mid -1;
            }


//            if (arr[mid] <= arr[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }  this needs to be replace to handle dup becasue the start and end will be same so


        }
        return -1; // element not found
    }
}






