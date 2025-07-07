import java.util.Scanner;

public class checkUpperr {
	public static void main(String[] args) {
		//  check whther the enterer char are upper case or not 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the character");
    char ch = sc.next().charAt(0);

    System.out.println((ch >='A' && ch <='Z' ?"the char is uppercase":"char is lowercase"));
    

	}
}
