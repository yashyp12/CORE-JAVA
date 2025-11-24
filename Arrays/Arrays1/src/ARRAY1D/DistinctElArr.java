package ARRAY1D;

public class DistinctElArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 5, 6, 7, 7, 8 };

		// Count how many distinct elements are in the array.
		
		System.out.println(distinctCount(arr));

	}

	static int distinctCount(int[] arr) {
		int countDistinct = 0;

		for (int i = 0; i < arr.length; i++) {

			boolean isAppearedBefore = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isAppearedBefore = true;
					break;
				}
			}

			if (isAppearedBefore==false) {
				countDistinct++;
			}
		}
		return countDistinct;
	}

}
