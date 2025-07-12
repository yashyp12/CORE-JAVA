// wjp if the boy is elgiible for marrying his gf
// 21 + , propertty more than 1 crore or surname is AMBANI

import java.util.*;
class marriage{

public static void main(String args []){

	System.out.println("eneter your age man");
	int age = new Scanner(System.in).nextInt();
	System.out.println("enter your property");
	int property = new Scanner(System.in).nextInt();

	System.out.println("enter your surname boy");
	String surname = new Scanner(System.in).nextLine().toUpperCase();

	if(age>21 && property == 10000000 || surname.equals("AMBANI")){
		System.out.println("go marry with her only if she is a daughter of ELON MUSK");
	}
	else{

		System.out.println("you are not eligible");
	}
}

}