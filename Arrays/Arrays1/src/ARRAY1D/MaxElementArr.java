package ARRAY1D;

public class MaxElementArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {21,12,36,5,8};
		
	 
		
		System.out.println(maxArr(arr));
	}
	
	static int maxArr(int []arr) {
		
		int max = arr[0]; //21
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
