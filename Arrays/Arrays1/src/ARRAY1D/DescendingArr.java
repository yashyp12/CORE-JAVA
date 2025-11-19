package ARRAY1D;

import java.util.Arrays;

public class DescendingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr = {23,3,12,23,35};
			
			for(int i =0;i<arr.length;i++) {
				for(int j = i+1; j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
	}

}
