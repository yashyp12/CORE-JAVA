package ARRAY1D;

public class SecondHighestArr {

	public static void main(String[] args) {
		int[]arr= {12,55,67,77,33};
		// TODO Auto-generated method stub
			System.out.println(SecondHighest(arr));
	}
	
	static String SecondHighest(int []arr) {
		int largest = arr[0];
		int SecondLargest = arr[0];
		
//		for(int i =0; i<arr.length;i++) {
//			
//			if(arr[i]>largest) {
//				SecondLargest = largest;
//				largest = arr[i];
//			}else if(arr[i]>SecondLargest) {
//				SecondLargest = arr[i];
//			}
//		}
		
        for(int j : arr){
            if(j>largest){
                SecondLargest = largest;
                largest = j;
            }else if (j>SecondLargest){
                SecondLargest = j;
            }
        }
		
		return "largest " + largest + " second largest " + SecondLargest;
		
		
	}

}
