import java.util.*;

class case2{

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the grade which you got in exam");
	    String Grade = sc.nextLine();


		switch(Grade){

		case "A":
			System.out.println("you have excellent grade");
			break;

		case "B":
			System.out.println("you have average grade");
			break;

		case "C":
			System.out.println("you have poor marks");
			break;

		default:
			System.out.println("you are pass");


		}


	}
}