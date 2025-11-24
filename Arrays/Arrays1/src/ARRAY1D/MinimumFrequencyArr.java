package ARRAY1D;

public class MinimumFrequencyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {2,3,2,5,3,8};
		int MinFrequency = Integer.MAX_VALUE;
		
		int element = 0;
		
		
		for(int i =0;i<arr.length;i++) {
			int count = 0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count<MinFrequency) {
				MinFrequency = count;
				element = arr[i];
			}else if(count == MinFrequency && arr[i]<element) {
				element = arr[i];
			}
		
		}
		
		System.out.println("min frequency elemt  are "+ element);
		
		
	}

}
