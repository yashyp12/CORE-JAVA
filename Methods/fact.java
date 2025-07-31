import java.util.Scanner;

public class fact {
 

    public static void main(String[] args) {
        
        
		Scanner sc = new Scanner(System.in);
		int fact =1;
		 
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        
		for(int i=num; i>=1;  i--){
           
             fact = fact*i;
            }
            
            System.out.println(fact);
}


    }
 