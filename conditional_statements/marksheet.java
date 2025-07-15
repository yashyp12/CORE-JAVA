import java.util.*;

class marksheet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("student Enter your total marks out of 500");
		float marks = sc.nextFloat();
		char grade ;

		float percentage = (marks / 500 *100);
		System.out.println("you got an " + percentage + "%");
		 
		if(percentage >=90){
			grade = 'A';
			System.out.println("you have an outstanding grade " + "your grade is " + grade);
		}else if(percentage >=70){
			grade = 'B';
			System.out.println("you have an good grade " + "your grade is " + grade);
		}
		else if(percentage >= 60){
			grade = 'C';
			System.out.println("you got an average marks " + "your grade is " + grade);
		}
		else if(percentage >=40){
			grade = 'D';
			System.out.println("your marks are below average " + " your grade is " + grade);

		}
		else if(percentage <40){
			grade = 'F';
			System.out.println("you are FAIL and your Grade is " + grade);
		}

	}
}
