
import java.util.*;

public class pract1 {

    // wjp for odd or even num only using if statement only
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("its an even number bhai");
        }

        if(num%2!=0){
            System.out.println("the number is odd");
        }
    }
}
