package arrays.searching.BinarySearch;
//https://youtu.be/W9QJ8HaRvJQ?si=J0bezcF5n1_4cztl&t=6206
//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/


//find the position of the element in the infinite array
public class InfiniteArr {
    static void main(String[] args) {
        // let assuem we have ana infinite array
        /*
        so we dont know the length of the  array
        so we are checking the target in the chunks
        as array is sorted so we are using binar ysearch
        we will bascially increase the length of the chunks exponentially
        i.e  log(n)
        so the first start with the box of length 2 then, 4 ,8,16
        look end = previous end + sizeOfBozx*2;
        while(target>end) try doubling the size of the box
        if it false the the target is behind the end
        it cannot be never behidn the start if yes then its already caught
        size of the array calcilated base on the = (end-start+1);

        since our array is the infinite so w are not using any length anywhere in teh program w are not going to use the length here
         */
        int[] arr = {2, 3, 4, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30,32,34};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // let first find the range
//        start from teh box 2
        int start = 0;
        int end = 1;
//        condition for the target to lie in the range

        while (target >arr[end]) {
//            store the new start first
            int newStart = end + 1;
            //now double the size of the box as ourr target is in the next halves maybne so
            //end = previous end + sizeOfBox*2;
            end = end + (end - start + 1) * 2;
//            now update the start with the new index
            start = newStart;
        }

//        now simply we got the range now just check the index from the array
        return binarySearchR(arr, start, end, target);
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
