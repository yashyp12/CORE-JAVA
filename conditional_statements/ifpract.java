import java.util.*;
class ifpract{


//if num/2 -> hi two  , if num/5 ->hi five , if num/ 2 and 5 both -> hi five two
	public static void main(String[] args) {
	int num= new Scanner(System.in).nextInt();

	if(num%2==0 && num%5!=0){
	System.out.println("hi two");
	}

	if(num%5==0  && num&2!=0){
		System.out.println("hiFive");
	}

	if(num%2==0 && num%5==0){
		System.out.println("hi fiveTwo");
	}



	}
}