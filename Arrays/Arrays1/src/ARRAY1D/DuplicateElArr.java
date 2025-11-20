package ARRAY1D;

public class DuplicateElArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 23, 4, 35,35, 6, 6, 7, 23, 7 };
	 

		for(int i =0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

//		another approach
//		for (int i = 0; i < arr.length; i++) {
//		    for (int j = 0; j < arr.length; j++) {
//		        if (i == j) continue;
//		        if (arr[i] == arr[j]) {
//		            System.out.println(arr[i]);
//		            break;
//		        }
//		    }
//		}
	}

}
