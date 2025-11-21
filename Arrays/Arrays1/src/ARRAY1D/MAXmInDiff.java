package ARRAY1D;

public class MAXmInDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Q15: Find difference between max and min
		
		int []arr = {2,3,4,1,5,6,7};
		int min = arr[0];
		int max = arr[0];
	
		
		for(int i =1;i<arr.length;i++) {
			
			if(arr[i] >max) {
		
				max = arr[i];
			 
			}else if(arr[i]<min) {
			
				min = arr[i];
			 
			}
		}
		
		int diff = max-min;
		System.out.println("the diff in max and min is " + diff);
		
	}

}
