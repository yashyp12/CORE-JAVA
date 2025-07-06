import java.util.*;

class Sum{

	public static void main(String[] args) {
	 
	 	Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum = 0;
		int rem;
		int dup = num;

		rem = num%10;   // it will return - only 4 fetches last value when it divide by modulas
		sum = sum + rem;
		num = num/10;    //divide by the tense -> removes last digit

		rem = num%10;
		sum  = sum + rem;
		num = num/10;

		System.out.println(" num : " + dup);
		System.out.println("sum is " + sum);

	}
}