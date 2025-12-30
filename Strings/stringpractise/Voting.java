import java.util.*;

public class Voting {
    
    public Voting(){
        System.out.println("This is a voting APP");
    }

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter your age");
        int age = sc.nextInt();  //default value is 0
        
         if(age<18){
            System.out.println("sorry you are not eligible for voting");

        }
        else{
            System.out.println("you are eligible for voting");

        }

        sc.close();

    }
}
