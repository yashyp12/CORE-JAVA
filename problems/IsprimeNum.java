import java.util.*;
class IsprimeNum{
	


public static void main(String[] args) {
	System.out.println("Enter a Number ");
	int num = new Scanner(System.in).nextInt();
	isPrime(num);
}

public static void isPrime(int num){
int count = 0;
	//1 step 1 : find the factorial of it
	for(int i=1;i<=num;i++){
		
		if(num%i==0){
			System.out.println(i);
			count ++;
		}

	}
	System.out.println("total factorials are " + count);
}


}