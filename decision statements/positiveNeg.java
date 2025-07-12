
import java.util.Scanner;

public class positiveNeg {
    
    // check whther the number is positive or negative

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        // in java if we have not used the blocks by default
        // the immediate statemet after the condition will be execute 
        if(num>0){
            System.out.println("the number is positive");
    }

    if(num == 0){
System.out.println("its an neutral num");
    }
    if(num<0){
System.out.println("its an negative num");
    }

    
}
}