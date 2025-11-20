package ARRAY1D;

public class CountNumBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,5,25,32,12,15};
//		Count numbers between 10 and 20
		
		int count  = 0;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<=20 && arr[i]>=10) {
				count++;
			}
		}
		
		System.out.println("total num between the range of 10 to 20 is " + count);
	}

}
