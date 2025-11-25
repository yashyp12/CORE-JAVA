package ARRAY1D;

public class checkDivisibleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,2,15,9};
		
		
		int divisibleBy3 = 0;
		int divisibleBy5 = 0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				divisibleBy3++;
			} 
		
			if(arr[i]%5==0) {
				divisibleBy5++;
			}
			
		}
		
		System.out.println("elements divisible by 3 is " + divisibleBy3 + "divisible by 5 is " + divisibleBy5);
	}
	
	

}
