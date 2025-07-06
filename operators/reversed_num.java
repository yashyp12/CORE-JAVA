package operators;
import java.util.*;

public class reversed_num {
    //wjp to revered the number - > 4321 , 1234- >

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // initialisation of variables 
        int num , rev = 0,dup,rem = 0;

        System.out.println("enter the number ");
        num = sc.nextInt();
        dup = num;
            

        while (num >0) {
            rem = num%10;         //returns the last digit from the number
            rev = rev*10+rem;
            num = num /10;            //remove the last digit only
            
        }
            System.out.println("the number is " + dup);
            System.out.println("the reversed string is " + rev);
        }             

        

    }
    
 
