package ARRAY1D;

public class OddIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {2,1,5,4,6,3};
int sum =0;

for(int i=0;i<arr.length;i++) {
	if(i%2!=0) {
		sum +=arr[i];
	}
}

System.out.println("sum is " + sum);
	}

}
