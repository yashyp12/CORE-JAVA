package DSA.BinarySearch;

public class DescendingArrBinary {

    /*
    if arr in dedscnding

    let search for 75
    middle elemet = start + (end-start)/2 = 3 ==>12
    then targer > middle -> left
                  end = middle -1;

         Target < middle - lies to the right
         start = mid + 1;

     */

//     arr = [ 90,75,18,12,6,4,3,1]

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int ans = descendingArr(arr, 9);
        System.out.println(ans);
    }

    static int descendingArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <=end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                //falls in right side
                start = mid + 1;
//                we need to comapre with the actual val not index so use arr[mid]
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
