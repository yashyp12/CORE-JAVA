
import java.util.*;

public class finance_app {
    
    public static void main(String[] args) {
        
        // wjp reads the subtotal and graduity rate, then computes
        // gravity and total. for ex,if the user enters 10 for subtotal and 15% 
        // for graduty rate, program displays 1.5 as graduity and 11.5 ass total .
        // 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the graduity rate");
        double graduity = sc.nextDouble();
        graduity = graduity/100;

        System.out.println("enter the subtotal");
        double subtotal = sc.nextDouble();

        // we need to first an convert percentage to the exact amount
        // means the graduity amount which will we apply eg - 1.5
        // formula we use whic is - percenateg * the amount on whcih weare applying / 100

        double TotalGraduity = subtotal*graduity;

        // now add that graduity oto the subtotal amount
        double total = TotalGraduity + subtotal;

        System.out.println("the tip is "+ TotalGraduity + " the total is  " + total);
    
    }
}
