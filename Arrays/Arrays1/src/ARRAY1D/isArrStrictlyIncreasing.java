package ARRAY1D;

public class isArrStrictlyIncreasing {

	public static void main(String[] args) {
		int[] arr = { 5,4,3,2,1,3 };

		System.out.println(isStrictlyDecreasing(arr));
		
	}

	
//	checking isStrictly Increasing
	static boolean isStrictlyIncreasing(int[] arr) {
 
		for (int i = 0; i < arr.length-1; i++) {
			 if(arr[i+1]<=arr[i]) {
				 return false;
			 }
		}
		return true;
	}
	
	
//	check if it is Strictly Decreasing
	static boolean isStrictlyDecreasing(int[] arr) {
		 
		for (int i = 0; i < arr.length-1; i++) {
			 if(arr[i+1]>=arr[i]) {
				 return false;
			 }
		}
		return true;
	}

}
