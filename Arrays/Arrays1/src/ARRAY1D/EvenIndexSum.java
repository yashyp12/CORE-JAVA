package ARRAY1D;

public class EvenIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,3,4,5};
		
		int EvenIndexSum = 0;
		
		 for(int i =0;i<arr.length;i+=2) {
			 EvenIndexSum +=arr[i];
		 }
		
		System.out.println("even index sum is " + EvenIndexSum);
	}

}
