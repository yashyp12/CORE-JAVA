package arrays.searching.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

// bascially in this example in short we wanted to find the max element ,
/*
1 there is a range is ther ascending and descending , like 1 2 3 5  6  4 3 2 <6 is the ans >
// so for this we using binary search only
by pointing 2 points
/ based on the 2 checks , if the arr[mid]>arr[mid+1] -> desc part of the array so there is possiblity that ans can be at left part
so then our end will be = end =  mid
2 -> if the arr[mid] < arr[mid+1] then we are in the asc part now ans can be in rhs desc part only
so the start = mid+1;
- at the end the start and end will be pointing to the max element only

 */

public class MountainPeakNum {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,7, 6, 3, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

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

        //at end,  start == end and pointing to the largest number because of the 2 checks above
        /*
        start and end always try to find the max ele in above 2 checks
        henc they are pointing to just one element ,i.e. max
        // me - at every point of time for start and end, they have the best possible ans till tht time
        if we are saying taht only 1 item is remainign , hence bcz of above line i.e is the best possible ans

         */

        //at the end both of start adn end will be pointing ot the same max elementi nthe array i.e ans
        return start; // it can be end a
    }


}
