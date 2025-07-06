package operators;
import java.util.*;

public class Sum_Num {
    

     


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number to sum");
        int num = sc.nextInt();
        int sum = 0;
        int dup = num;
        
        // step 1 -> take input from the user ex - 4321 

        // int rem = num % 10; // stores remainder
        // sum = sum + rem;   // stores sum
        // num = num / 10;  //returns by removingthe last digit form the num
        
      while (num >1) {
          int rem = num%10;
          sum = sum + rem;
          num = num / 10;

    }
    
    System.out.println("the original num is " + dup);
    System.out.println("the sum of num is " + sum);
        




    }
}
