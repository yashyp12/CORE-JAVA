package ARRAY1D;

public class DistinctElArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,5,5,6,7,7,8};
		
		// Count how many distinct elements are in the array.
	 
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				 System.out.println(arr[j]);
				} 
			}
		}
	 
		
		 
	}

}
