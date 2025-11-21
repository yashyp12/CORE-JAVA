package ARRAY1D;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,3,4,7,6,6,5};
		
		int largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecondLargest = largest;
				largest = arr[i];
			}else if(arr[i]>SecondLargest) {
				SecondLargest = arr[i];
			}
		}
		
		System.out.println("largest is " + largest + "second Largest is " + SecondLargest);
	}

}
