package ARRAY1D;

public class SecondSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {2,1,1,6,3};
		
		int Smallest = Integer.MAX_VALUE;
		int SecondSmallest = Integer.MAX_VALUE;
		
		if(arr.length<2) {
			System.out.println("array dont have second smallest val ");
			return;
		}
		
		
		for(int i =0;i<arr.length;i++) {
			 
			if(arr[i]<Smallest) {
				SecondSmallest = Smallest;
				Smallest = arr[i];
			}else if(arr[i]>Smallest && arr[i]<SecondSmallest){
				SecondSmallest = arr[i];
			}else if(arr[i]==Smallest) {
				continue;
			}
		}
		
		System.out.println("Smallest is " + Smallest + " Second Smallest is " + SecondSmallest);
	}

}
