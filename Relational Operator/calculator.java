import java.util.*;

public class calculator {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the first Number");
        int num1 = sc.nextInt();

        System.out.println("enter the num2");
        int num2 = sc.nextInt();

        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);

        String op = "";

        // ternary nested operators 
        op = (operator=='+')?(op += num1 + num2):(operator == '-')?
        (op +=  num1 - num2):(operator == '*')?
        (op +=  num1 * num2):(operator == '/')?
        (op += num1 / num2): (operator == '%')?
        (op+= num1 % num2): (op += "INVALID");

        if (!(op.equals("INVALID"))) {
            System.out.println("its an invalid input");
        }

        System.out.println(num1 + " " + operator + " " + num2 + "  = " + op );
        

    }
}
