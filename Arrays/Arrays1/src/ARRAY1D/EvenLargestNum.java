package ARRAY1D;

public class EvenLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,4,5,12,15};
		
		int EvenLargest = Integer.MIN_VALUE;
		
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				if(arr[i] > EvenLargest ) {
					EvenLargest = arr[i];
				}
			}
			
			
		}
		
		System.out.println("Even largest value is " + EvenLargest);
	}

}
