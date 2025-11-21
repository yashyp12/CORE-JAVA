package ARRAY1D;

 
public class SmallestOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,5,2,6,5,4};
		int SmallestOdd =Integer.MAX_VALUE;
		
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				
				if(arr[i]<SmallestOdd) {
					SmallestOdd = arr[i];
				}
			}
			
		}
		
		System.out.println("SmallestOdd num is " + SmallestOdd);
	}

}
