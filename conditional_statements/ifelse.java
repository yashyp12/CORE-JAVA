import java.util.*;
class ifelse{

	public static void main(String[] args) {
		
		System.out.println("Shopping Starts");

		System.out.println("enter the bill amount");

		double billAmount = new Scanner(System.in).nextDouble();
		double disc = 15/100; //convert percentage to decimalcal

		if(billAmount>=5000){
			System.out.println("you got an discount");
			billAmount = billAmount- (billAmount*15)/100;
			System.out.println("your total bill is " + billAmount);
		}
	}
}