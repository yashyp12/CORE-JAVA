package ARRAY1D;

public class IndexOfFirstOccur {

	/*
	 * Q5: Find index of first occurrence
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,3,6,5,3,6};
		int num = 6;
		int count =0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==num && count ==0) {
				System.out.println(i);
				count++;
			}
		}
		
		
	}

}
