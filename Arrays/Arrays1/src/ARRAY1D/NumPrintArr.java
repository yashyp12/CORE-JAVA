package ARRAY1D;

public class NumPrintArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we wanted to print the array in ascending way
		
		int []arr = {1,2,3,4,5,8,9};
		
		int num = 5;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<=num) {
				System.out.println(arr[i]);
			} 
			
		}
	}

}
