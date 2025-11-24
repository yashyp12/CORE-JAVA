package ARRAY1D;

public class ArrContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []arr = {2,2,30};
	System.out.println(containsZero(arr));	 
	}

	static boolean containsZero(int []arr) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==0) {
				return true;
			
			}
		}
		
		return false;
		
	}
}
