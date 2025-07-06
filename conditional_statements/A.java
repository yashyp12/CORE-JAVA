package conditional_statements;
import java.util.*;

public class A {
    // conditional statements - if else

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         

        System.out.println("Please Enter your age ");
        int age = sc.nextInt();
        if(age>10){
            System.out.println("you can drive ");
            
        }
        else if(age!=20){
            System.out.println("no you cannot drive");
        }
        else{
            System.out.println("you can dirve");
        }

        sc.close();
    }

}
