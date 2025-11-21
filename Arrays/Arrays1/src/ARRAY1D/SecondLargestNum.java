package ARRAY1D;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {5,5,5};
		
		int largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		 
		if(arr.length<2) {
			System.out.println("no second largest");
			largest = Integer.MIN_VALUE;
			SecondLargest = Integer.MIN_VALUE;
			return;
		}
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				SecondLargest = largest;
				largest = arr[i];
		 
			}else if(arr[i]<largest && arr[i]>SecondLargest) {
				SecondLargest = arr[i];
			}else if(arr[i]==largest){
				continue;
			}
			
		}
		
		if(SecondLargest == Integer.MIN_VALUE) {
			System.out.println("no second distinct elemnt found");
		}
 		 
		System.out.println("largest is " + largest + " second Largest is " + SecondLargest);
	}

}
