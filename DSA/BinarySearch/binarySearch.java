package DSA.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {

// stp 1 - find the middle element 
// stp 2 - if target > middle -> search in right
        // else search in left
// step 3 - if middle element  == target elemt // ans

        // if start > end : element not found

//- used on sorted array either in ascending or descening order

// take 2 pointer start and end  (ascendig order )
        //find the middle = start + end /2
        // check if targer > or < middle or == target element
        // then choose whterh the right or left array
        // if middle == targer return ans
        //we are not creating new array we are just changin the start and end point

        // if it lies in right side of arr the star = middle +1;
        // if it lies in left side the nonly end wil change end = middle -1;

//        sorted aray
        int[] arr = {-18,1, 2, 3, 4, 5, 6,45,55};

        int ans = binarySearch21(arr, 55);

        System.out.println(ans);

    }

/*
    mid = (start + end) / 2
    this can lead toan issue because start and end can become overflow in integer


start + (end - start)/2
Same logic, avoids overflow

 */


    static int binarySearch21(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                // lies on left sie then end = end-1
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else { // ans found
                return mid;
            }
        }
        return -1;

    }
}
