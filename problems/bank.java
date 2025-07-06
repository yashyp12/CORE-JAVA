import java.util.*;

public class bank {

    /**
     * save 100 each month, into ac with annual intrest - 5%
     * thus monthly intrest is 0.05/12 = 0.00417
     * after first month value ac - 100*(1+0.00417) = 100.417
     * after seconds month - (100+100.417)*(1+0.00417)=201.252
     * wjp prompts uer enter monthly amount and display value after 6 month
     */

    // formula for compount intrest - Final amount = Principal × (1 + rate)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ac;
        // we need to convert the percentage to num by dividing / 100
        // float annual_intrest = 5/100; it will thro error brcuase java removes
        // precisoin
        // when we divide 2 integers

        // Tere paas ₹100 hain. Bank interest diya ₹0.42.
        // Agar tu sirf 100 × 0.00417 karega = ₹0.42
        // Par tujhe chahiye total = ₹100 + ₹0.42 = ₹100.42

            // Total = Principal × (1 + interest rate)

        double annual_intrest = 5.0 / 100;
        double monthly_intrest = annual_intrest / 12;

        System.out.println("enter the amount to save");
        double savings = new Scanner(System.in).nextDouble();

        // for first month
        ac = savings * (1 + monthly_intrest);
        System.out.println("for the first month your intrest amount is " + ac);

        System.out.println("total bank balance is " + ac);

        // for seconds month
        ac = (ac + savings) * (1 + monthly_intrest);
        System.out.println("for second month the intrest is " + ac);

        System.out.println("toal balance is " + ac);
        // for seconds month
        ac = (ac + savings) * (1 + monthly_intrest);
        System.out.println("for third month the intrest is " + ac);

        System.out.println("toal balance is " + ac);
        // for seconds month
        ac = (ac + savings) * (1 + monthly_intrest);
        System.out.println("for four month the intrest is " + ac);

        System.out.println("toal balance is " + ac);
        // for seconds month
        ac = (ac + savings) * (1 + monthly_intrest);
        System.out.println("for five month the intrest is " + ac);

        System.out.println("toal balance is " + ac);
        // for seconds month
        ac = (ac + savings) * (1 + monthly_intrest);
        System.out.println("for six month the intrest is " + ac);

        System.out.println("toal balance is " + ac);

    }



























































}
