package practise_set;
import java.util.*;

import conditional_statements.casse;

public class cqh1 {
    
    // wjp to find the day of week by given num 1 for monday
    // 2 for tuesday like these

    public static void main(String[] args) {
        
    

    Scanner sc  = new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();

        
    switch(num){

        case(1):
        System.out.println("welcome monday ");
        break;
        case(2):
        System.out.println("welcome tuesday ");
        break;
        
        case(3):
        System.out.println("welcome its wednesday");
        break;

        case(4):
        System.out.println("its thursday");
        break;

        case(5):
        System.out.println("its friday here");
        break;

        case(6):
        System.out.println("here is a saturday");
        break;

        default:
        System.out.println("hey welcome to week ");
    }



    }
}
