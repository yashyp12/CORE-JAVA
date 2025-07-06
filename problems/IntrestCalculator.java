import java.util.*;
public class IntrestCalculator {
    
    public static void main(String[] args) {
        
        // wjp that readds balance and annual percnetage intrest
        // rate and displays the intrest for the next month


    Scanner sc = new Scanner(System.in);
        double intrest = 0;
        System.out.println("enter the balance");
        double balance = sc.nextDouble();
        System.out.println("enter the annual percentage intrest rate ");

        double annual_rate = sc.nextDouble();

        // so annual rate assume 12 , then we want one month rate so / 12 , then = 1% now we want it in decimal
        // so let divide it by / 100 
        intrest = balance * (annual_rate/12/100);

System.out.println("the intrest is " + intrest);

sc.close();
    }
}
