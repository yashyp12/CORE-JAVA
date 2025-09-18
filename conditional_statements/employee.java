// write an program increase pay of employeee by 3% if the 
// monthly target score is more than 90, otherwise increases pay by 1%;
import java.util.*;
class employee{

	public static void main(String args[]){

		System.out.println("enter your salary");
		double salary = new Scanner(System.in).nextDouble();

		System.out.println("enter your monthly target score");
		int monthlyTarget = new Scanner(System.in).nextInt();

		if(monthlyTarget > 90){

			System.out.println("you got 3 % increase in slaary");

			salary = salary + (salary*3/100);
			System.out.println("your total salary is " + salary);
		}
		else{
			System.out.println("you got only 1% hike");
			salary = salary + (salary*1/100);
			System.out.println("your total salary is " + salary);
		}
	}
}