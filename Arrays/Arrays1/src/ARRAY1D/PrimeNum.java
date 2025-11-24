package ARRAY1D;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 13;

int den = 2;
//System.out.println(isPrime(num,den));
int c =2;
System.out.println(isPrime2(num,c));


	}
	
//	static boolean isPrime(int num,int den) {
//		
//		while(den<=num/2) {
//			
//			if(num%den ==0) {
//				break;
//			}
//			den++;
//		}
//
//		return den>num/2;
//	}
	
static boolean isPrime2(int num,int c) {
		
		while(c*c<=num/2) {
			
			if(num%c ==0) {
				break;
			}
			c++;
		}

		return c*c>num;
	}

}
