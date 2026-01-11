package arrays.searching.BinarySearch;

public class BinaryExanple1 {


    static void main(String[] args) {
        int[]arr = { 1,2,2,5,5,34,54,5,45,4,54,5,45,4,53,54,5,345,4,4,55,456,5,6,6,6,7,5,756,75,567,65,756,75,75,756,75,75,675,675,67,56,56};
        System.out.println(binarySearch(arr,55));
    }

static int binarySearch(int[]arr, int target){
    int start = 0;
    int end = arr.length-1;

    while(start<=end){
       int mid = start + (end-start)/2;

       if(target< arr[mid]){
           end = mid-1;
       }else if(target > arr[mid]){
           start = mid + 1;
       }else{
           return mid;
       }
    }
    return -1 ;
}

}

//return the index
