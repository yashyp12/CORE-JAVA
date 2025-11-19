package ARRAY1D;

import java.util.Arrays;

public class AscendingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sort the array ascending way

		// for ascending do - < and for descending do >
		int[] arr = { 1, 2, 5, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("ARRAY IS " + Arrays.toString(arr));
	}

}
