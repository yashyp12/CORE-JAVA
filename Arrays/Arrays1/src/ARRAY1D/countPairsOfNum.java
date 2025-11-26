package ARRAY1D;

public class countPairsOfNum {

	public static void main(String[] args) {
	 
		
		int []arr = {2,4,3,5,6};
		int count = 0;
		int k = 7;
		
		for(int i =0;i<arr.length;i++) {
		
			for(int j  = i+1;j<arr.length;j++) {
				if(j<i) break;
				
				if(arr[i]+arr[j]==k) {
					System.out.println("match found (" + arr[i] + " " + arr[j] + ")");
					count++;
				}
			}
		}
		
		System.out.println("count is matched pairs are " + count );
		
	}

}
