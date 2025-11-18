package ARRAY1D;

public class PrimeArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {12,56,25,32,3,7,5};
		
		for(int i =0; i<arr.length;i++) {
			
			int num = arr[i];
			int count = 0;
			
			//check prime
			for(int j=2;j<num/2;j++) {
				if(num%j==0) {
					count++;
				}
			}
			
			if(count==0) {
				System.out.println("no of prime  " + num);
			}
		}

	}

}
