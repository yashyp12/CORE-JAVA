import java.util.*;


public class rever{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();
		int rev = 0;
		int rem = 0;
		int dup = num;


		while(num > 0){

		rem = num % 10;
		rev = rev * 10 + rem;
		num = num /10;
		}
		

		System.out.println("the number is " + dup);
		System.out.println("reverse number is " + rev);



	}

}