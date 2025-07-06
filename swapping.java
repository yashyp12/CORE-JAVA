class Swapping{


	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("before swapping "+ a +" "+ b);

		  a = a+b; // a is now 30
		  b = a-b; // b is 30-20 = 10 
		  a = a-b;
		System.out.println("after swapping a is"+a +" "+b);



	}
}