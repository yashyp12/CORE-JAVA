package ARRAY1D;

public class EvenIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,5,63,25,2};
		
		int EvenIndexSum = 0;
		
		for(int i =0; i<arr.length;i++) {
			if(i%2==0) {
				EvenIndexSum +=arr[i];
			}
		}
		
		System.out.println("even index sum is " + EvenIndexSum);
	}

}
