import java.util.Arrays;

class MergeSortExample{
	
	//dividing and coquer approach
	public static void main(String[] args) {
		
		int [] arr = {5,6,4,7,3,8,2,9,1,0};

		System.out.println("Before :" + Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("After :" + Arrays.toString(arr));
	}

	public static void mergeSort(int []arr,int l, int r)
	{
		if(l<r){
			int mid = (l+r)/2;
			mergeSort(arr,l,mid); //left sub-array
			mergeSort(arr,mid+1,r); //right sub-array
			merge(arr,l,mid,r); 
		}
	}

	public static void merge(int []arr,int l,int mid, int r){
		int len1 = mid -l+1; // left array length
		int len2 = r-mid; // right array length

		int []left = new int[len1];
		int []right = new int[len2];

		for(int i =0;i<len1;i++){
			left[i] = arr[l+i];
		}

		for(int i =0;i<len2;i++){
			right[i] = arr[mid+i+1];
		}

		int i =0,j=0,k=l;

		while(i<len1 && j<len2){
			if(left[i]<=right[j]){
				arr[k++]=left[i++];
			}else{
				arr[k++] = right[j++];
			}
		}

		while(i<len1){
			arr[k++] = left[i++];
		}

		while(j<len2){
			arr[k++] = right[j++];
		}
	}
}