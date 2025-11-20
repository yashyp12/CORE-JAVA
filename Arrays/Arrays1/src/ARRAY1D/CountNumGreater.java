package ARRAY1D;

public class CountNumGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q11: Count numbers greater than 10
		
		int []arr = {2,4,5,2,11,25,36,5};
		int count = 0;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>=10) {
				count++;
			}
		}
		
		System.out.println("count is " + count);

}
}