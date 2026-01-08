package arrays.searching.LinearSearch;

public class SearchInRange {

    static void main(String[] args) {

        System.out.println(SearchInRange(new int[]{1,2,3,4},4,0,3));
    }

    static int SearchInRange(int[]arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        if(start>=0 && end<arr.length) {
            //run for loop
            for (int i = start; i <= end; i++) {
                if(target == arr[i]){
                    return i;
                }
            }
        }
       return -1;
    }

}
