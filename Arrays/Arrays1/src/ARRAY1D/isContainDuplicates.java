class isContainDuplicates
{
	
	public static void main(String[] args) {
		

		int []arr = {2,4,5,3,2,3};

		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){

				if(i==j) continue;

				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					break;
				}

			}

		}


	}
}