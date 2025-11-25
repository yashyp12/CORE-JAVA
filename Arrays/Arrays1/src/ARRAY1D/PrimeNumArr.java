package ARRAY1D;

public class PrimeNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {4,3,6,7,8,10};
		
		int count = 0;
		
			
		for(int n:arr) {
		
			
			if(n<2) continue;
			
			
			boolean prime = true;
			for(int d =2; d*d<=n;d++) {
				
				if(n%d==0)
				{
					prime = false;
					break;
				}
			}
			
			if(prime) {
				count++;
			}
		}
		
		System.out.println("count is " + count);
		 

}

}