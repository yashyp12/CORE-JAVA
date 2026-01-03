import java.util.Arrays;
class QuickSort{
	

	public static void main(String[] args) {
		int[]arr = {8,6,4,7,3,0,2,9,1,5};

		System.out.println("before " + Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("After : " + Arrays.toString(arr));
	}

	static void quickSort(int[]arr, int start, int end) {
        if (end < start) return;

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

	static int partition(int []arr, int start,int end){
		int pivot = arr[end];
		int j = start -1;

		for(int i=start;i<end; i++){
			if(arr[i]<pivot){
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		j++;
		int temp = arr[j];
		arr[j] = arr[end];
		arr[end] = temp;

		return j;
	}
}