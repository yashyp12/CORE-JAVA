package ARRAY1D;

public class CountNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,4,5,5,5,6};
		
		
		int count = 0;
		int num = 5;
		
		for(int i =0; i<arr.length;i++) {
			
			if(arr[i]==num) {
				count++;
			}
		}
		
		System.out.println("count of num is " + count);
	}

}
