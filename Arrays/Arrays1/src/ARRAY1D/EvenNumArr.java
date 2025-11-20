package ARRAY1D;

public class EvenNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {2,4,5,6,8,7,3,1};
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("even num are " + arr[i]);
			}
		}
	}

}
