package ARRAY1D;

public class DuplicatesArr {

	public static void main(String[] args) {
		 int []arr = {2,3,6,4,9};
		 
		System.out.println(duplicateElement(arr)); 

	}
	
	static int duplicateElement(int []arr) {
		 
		for(int i =0; i<arr.length;i++) {		
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
		
	}

}
