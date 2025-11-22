package ARRAY1D;

public class printDuplicationElement {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 2, 5, 3 };

		for (int i = 0; i < arr.length; i++) {
			boolean didAppeared = false;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] == arr[i]) {
					didAppeared = true;
					break;

				}
			}
			System.out.println(arr[i]);
		}

	}

}
