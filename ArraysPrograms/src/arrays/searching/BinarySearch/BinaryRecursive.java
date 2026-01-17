package arrays.searching.BinarySearch;

public class BinaryRecursive {

	public static void main(String[] args) {

        int[]arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 7;
        int pos = binarySearchR(arr,0,arr.length-1,target);
        System.out.println(target + " :" + pos);
	}

    public static int binarySearchR(int[]arr, int start, int end,int target)
    {
        if(start>end) return -1;

        int mid = start + (end-start)/2;


        if(arr[mid]==target) {
            return mid;
        }else if(target<arr[mid]){
            return binarySearchR(arr,start,mid-1,target);
        }else{
            return binarySearchR(arr,mid+1,end,target);
        }
    }

}
