package arrays.searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnositic(arr, 9));
    }
    static int orderAgnositic(int[] arr, int target) {
        // we use the order agnostics when we dont know whether the array is sortewd asc or desc
        // we achievwd it basically using by  comparing the start and end val of an array
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in asc or descednig
        boolean isAsc = arr[start] < arr[end];


        while(start<=end){
            int mid = start + (end-start)/2;
            //same condition for both asc desc
            if(arr[mid] == target) return mid;
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }
            }   else{
                    if(target<arr[mid]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
        }
        return -1;
    }

}

