package ARRAY1D;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Q11. Find the maximum element using a single loop.
		
		int []arr = {2,3,5,6,7,8,9};
		
		int max = Integer.MIN_VALUE;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("maximum value "+ max);
	}

}
