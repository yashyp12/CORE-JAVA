// public class test {
 
// class FrequencyOfArray{
// 	public static void main(String[] args) 
// 	{
// 		int [] arr={10,20,40,30,10,40,70,50,10,60,50,20,30,70,80,70,10,40,90,10};
// 		System.out.println(Arrays.toString(arr));

// 		int [] frequency=frequencyOfArray(arr);
// 		System.out.println("Frequency Of and Arrays"+Arrays.toString(frequency));
// 		System.out.println("-1 means no is already counted ");

// 		int [] removeDuplicates=duplicate(arr,frequency);
// 		System.out.println("Removed duplicate ele : "+Arrays.toString(removeDuplicates));

// 		int [] uni= uniDupRepSepArr(arr,frequency);


		
// 	}
// 	public static int [] frequencyOfArray(int [] arr)
// 	{
// 	   int []count=new int [arr.length];

// 		for (int i=0;i<arr.length ;i++ ) 
// 		{
// 			if (count[i]!=-1) {
// 				int ct=0;

// 				for (int j=i+1;j<arr.length ;j++ ) {
// 					if (arr[i]==arr[j]) {
// 						ct++;
// 						count[j]=-1;
// 					}
// 				}
// 				count[i]=ct;	
// 			}
// 		}
// 		// for (int i=0;i<count.length ;i++ ) {
// 		// 	if (count[i]!=-1) {
// 		// 		System.out.println(arr[i]+" is repeated at "+count[i]+" times");
// 		// 	}
// 		// }
// 		return count;
// 	} 
// 	public static int [] duplicate(int[]arr,int [] frequency){
//         int cnt=0;
//         for (int i=0;i<frequency.length ;i++ ) {
//         	if (frequency[i]!=-1) {
//         		cnt++;
//         	}
//         }
//         // System.out.println(cnt);
//         int ans[]=new int[cnt];

//         for (int i=0,j=0;i<arr.length ;i++ ) {
//         	if (frequency[i]!=-1) {
//         		ans[j]=arr[i];
//         		j++;
//         	}
//         }
//         return ans;
// 	}
// 	public static int [] uniDupRepSepArr(int[]arr,int [] frequency)
// 	{
// 		int unicnt=0,dupcnt=0,repcnt=0;

// 		for (int i=0;i<frequency.length ;i++ ) {
// 			if (frequency[i]==0) {
// 				unicnt++;
// 			}
// 			else if (frequency[i]>0) {
// 				repcnt++;
// 			}
// 			else if (frequency[i]==-1) {
// 				dupcnt++;
// 			}
// 		}

		
// 		int []unique=new int [unicnt];
// 		int []dupl=new int [dupcnt];
// 		int []repeat=new int [repcnt];

// 		for (int i=0,j=0,k=0,l=0;i<arr.length ;i++ ) {
// 			if (frequency[i]==0) {
// 				unique[j]=arr[i];
// 				j++;
// 			}
// 			else if (frequency[i]==-1) {
// 				dupl[k]=arr[i];
// 				k++;
// 			}
// 			else if (frequency[i]>0) {
// 				repeat[l]=arr[i];
// 				l++;
// 			}
// 		}
// 		System.out.println("UNIQUE  : "+Arrays.toString(unique));
// 		System.out.println("REPEATED: "+Arrays.toString(repeat));
// 		System.out.println("DUPLICATE : "+Arrays.toString(dupl));

// 		return repeat;

// 	}
// }
// }
