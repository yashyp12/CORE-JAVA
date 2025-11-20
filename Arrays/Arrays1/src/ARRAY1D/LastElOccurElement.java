package ARRAY1D;

public class LastElOccurElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int []arr = {2,4,5,3,6,5,8,5,6,42,3,5};
		int num = 5;
		int indx =0;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==num) {
				indx = i;
			}
		}
		
		System.out.println("last occurence of num is " + indx);
	}

}
