package ARRAY1D;

public class LargestEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q16. Find the largest even number.
		
		int []arr = {4,3,2,7,9,12};
		int largest = arr[0];
		int EvenLargest = -1;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>largest && arr[i]%2==0) {
				EvenLargest =arr[i];
			}else if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Even largest num is " + EvenLargest + " nd largest num is " + largest);
	}

}
