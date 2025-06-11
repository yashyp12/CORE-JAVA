import java.util.*;
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal number");
		int principal = sc.nextInt();
		
		System.out.println("enter the rate of intrest");
		int rate = sc.nextInt();
		
		System.out.println("Enter the time period ");
		int time = sc.nextInt();
		
		double Simple_Intrest = (principal * rate*time) / 100;
		
		System.out.println("Your simple intrest is " + Simple_Intrest);
		sc.close();
	}
}

