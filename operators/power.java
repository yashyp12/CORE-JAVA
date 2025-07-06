package operators;
import java.util.*;

public class power {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the base number");
        int base = sc.nextInt();

        System.out.println("enter the exponent num");
        int exponent = sc.nextInt();


        // 5 base , 2 expo , 5*5
        int power = 1;

        for(int i =0; i<exponent; i++){

            power = power * base;

        }
    
    System.out.println(power);
    }
}
