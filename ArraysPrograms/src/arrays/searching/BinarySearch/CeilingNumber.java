package arrays.searching.BinarySearch;

public class CeilingNumber {

    static void main(String[] args) {
        int[]arr = {2,3,5,8,13,14,16,18};
        System.out.println(floorNum(arr,15));

    }

    static int celingNum(int arr[],int target){
        if(target<0) return -1;

        //find the ceilin num means - smallest greatest element from the array
        // ele >=target , means target is 14 the , 14 or >=14 which is 15 is acceptable
        // breaking the violocation is the solution for this problem
        // like when the start >end then that time the ans will be start = end+1 which will be the
        // ele greater than or = target
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;




    }

//    floor number
     static int floorNum(int arr[],int target){
        if(target<0) return -1;

        //find the ceilin num means - smallest greatest element from the array
        // ele >=target , means target is 14 the , 14 or >=14 which is 15 is acceptable
        // breaking the violocation is the solution for this problem
        // like when the start >end then that time the ans will be start = end+1 which will be the
        // ele greater than or = target
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;


    }
}
