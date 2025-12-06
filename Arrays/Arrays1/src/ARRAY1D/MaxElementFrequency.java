package Arrays1.src.ARRAY1D;

public class MaxElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {2,5,5,6,7,7,5};
		
//		Find the element with maximum frequency
		
		System.out.println(maxFrequencyElement(arr));
	}
	
	static int maxFrequencyElement(int [] arr) {
			
		int maxFrequency = -1;
		int element = -1;
		
		
		for(int i =0; i<arr.length;i++) {
			
			int count =0;
			for(int j =0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
				count++;	
				}
				
			}
			if(count>maxFrequency) {
				maxFrequency = count;
				element = arr[i];
			}
		}
		
		return element;
	}

	
	
//	 as per gfg question - 
//	static int maxFrequencyElement2(int [] arr) {
//		
//		int maxFrequency = -1;
//		int element = -1;
//		
//		
//		for(int i =0; i<arr.length;i++) {
//			
//			int count =0;
//			for(int j =0;j<arr.length;j++) {
//				
//				if(arr[i]==arr[j]) {
//				count++;	
//				}
//				
//			}
//			if(count>maxFrequency) {
//				maxFrequency = count;
//				element = arr[i];
//			}
//		}
//		
//		return element;
//	}

}
