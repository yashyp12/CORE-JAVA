package arrays.searching.SentinelSearch;

/*
simialry to the binary search ,we just dividethe array into the 3 halves in that there is mid1 and mid2 is there
formula for calculating mid1 = start + (end-start)/3;
                        mid 2 = end - (end-start)/3;
 */

public class TernarySearch {

    static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ternarySearch(arr,7));

    }

    static int ternarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            //calculate mid1 and mid2
            int mid1 = start + (end-start)/3;
            int mid2 = end - (end-start)/3;

            if(arr[mid1]==target) return mid1;
            if(arr[mid2]==target) return mid2;

            if(target<arr[mid1]){
                end = mid1-1;
            }else if(target>arr[mid2]){
                start = mid2+1;
            }else{
                start = mid1+1;
                end = mid2-1;
            }
        }
        return -1;


    }

}
