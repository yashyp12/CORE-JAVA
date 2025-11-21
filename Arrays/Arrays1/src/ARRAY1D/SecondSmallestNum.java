package ARRAY1D;

public class SecondSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {4,5,3,1,6};
		
		int Smallest = arr[0];
		int SecondSmallest = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<Smallest) {
				SecondSmallest = Smallest;
				Smallest = arr[i];
			}else if(arr[i]<SecondSmallest) {
				SecondSmallest = arr[i];
			}
		}
		
		System.out.println("Smallest is " + Smallest + " Second Smallest is " + SecondSmallest);
	}

}
