package operators;
import java.util.*;

public class Num_Multiply {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        int product = 1;
        int rem;
        int dup = num;
        
        while (num >= 1) {
            
            rem = num % 10;
            product = product * rem;
            num = num/10;
        }
     
        System.out.println("digit is " + dup);
        System.out.println("the product is " + product);

        sc.close();
    }
}
