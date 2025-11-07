public class minFind20{
	
	public static void main(String[] args) {
		
		int[]arr = {25,45,2,3};
		System.out.println(minArr23(arr));
	}

	static int minArr23(int []arr){
		int minNum = arr[0];

		for(int i =1; i<arr.length; i++){
			if(arr[i]<minNum){
				minNum = arr[i];
			}
		}
		return minNum;
	}
}