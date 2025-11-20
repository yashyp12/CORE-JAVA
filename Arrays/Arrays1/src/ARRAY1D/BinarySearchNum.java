package ARRAY1D;

public class BinarySearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {2,};
		int num = 1;
		
		
		 BinarSearch(arr,num);
		 
}
	
static void BinarSearch(int[]arr,int num) {
			
		int start = 0;
		int end = arr.length-1;
		
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid] == num) {
				System.out.println(mid);
				return;
			}else if(arr[mid]<num) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println("element not found");
 	
	}

}