package ARRAY1D;

import java.util.Arrays;

public class printDuplicationElement {

	// Q24. Print all duplicate elements once (avoid repea􀆟ng same duplicate).
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 2, 5, 3 ,2,4,5,6,3,6};

		// approach - step 1 -
		/*
		 * first check whether the arr[i] is exist before till i-1 or not if yes then
		 * skip it because it alrleady checked by another loop if not then go to next
		 * check whether it founds in later or not which is check from i +1 to arr.len
		 * 
		 */

		for (int i = 0; i < arr.length; i++) {

			boolean appearedBefore = false;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					appearedBefore = true;
					break;
				}
			}	

			if (appearedBefore) {
				continue; // skip because it already checked by another one
			}

			boolean appearedLater = false;
			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					appearedLater = true;
					break;
				}
			}

			if (appearedLater) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
