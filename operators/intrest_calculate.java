package operators;

import java.util.*;

public class intrest_calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int annual_intrest = 5%; need to convert the percentage (percentage/100)
        float annual_intrest = 0.05f;

        double monthly_intrest = annual_intrest / 12;
        double amount = 100;
        double ac = 0;
        double total_amount = 0;


        // first month
        total_amount = (amount+ac)* (1 + monthly_intrest);
        System.out.println("total amount for first month is " + total_amount);
        ac = total_amount;

        // for second month

        total_amount = (ac + total_amount) * (1 + monthly_intrest);
        ac = total_amount;

        System.out.println("total amount for the second month is " + total_amount);
        // for third month


    
    }
}
