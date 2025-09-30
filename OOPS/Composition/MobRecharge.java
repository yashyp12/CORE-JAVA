
import java.util.Scanner;

class Plan {

    String plan;
    double price;
    int validity;
    String benefits;
    String operator;

    Plan(String plan, double price, int validity, String benefits, String operator) {
        this.plan = plan;
        this.price = price;
        this.validity = validity;
        this.benefits = benefits;
        this.operator = operator;
    }

    public void ShowPlan() {
        System.out.println("           ");
        System.out.println("--/PLAN DETAILS /---");
        System.out.println("CURRENT PLAN IS " + plan);
        System.out.println("PLAN PRICE IS " + price);
        System.out.println("Current Plan Validity is " + validity);
        System.out.println("Current Plan benefits are " + benefits);
        System.out.println("Current operator is " + operator);
    }

}

class Payment {

    String PaymentMode;
    double amount;
    int transactionId = 1231;
    Boolean status;

    Payment(String PaymentMode, double amount, Boolean status) {
        this.PaymentMode = PaymentMode;
        this.amount = amount;
        this.transactionId = transactionId++;
        this.status = status;
    }

    public void showPayment() {
        System.out.println("               ");
        System.out.println("--PAYMENT DETAILS --");
        System.out.println("Payment Mode : -" + PaymentMode);
        System.out.println("Amount - " + amount);
        System.out.println("transaction Id - " + "UPI" + transactionId);
        System.out.println("status - " + status);
        System.out.println("         ");
    }

}

class Recharge {

    long MobNumber;
    String Circle;
    String email;
    Plan plan;
    Payment payment;

    Recharge(long MobNum, String Circle, String email, Plan plan, Payment payment) {

        this.MobNumber = MobNum;
        this.Circle = Circle;
        this.email = email;
        this.plan = plan;
        this.payment = payment;
    }

    public void showRecharge() {
        System.out.println("          ");
        System.out.println("----RECHARGE -----");
        System.out.println("Mob Number " + MobNumber);
        System.out.println("Circle " + Circle);
        System.out.println("Email -" + email);
        plan.ShowPlan();
        payment.showPayment();
    }

}

public class MobRecharge {

    public static void main(String[] args) {
//  Recharge(String MobNum, String Circle,String email,Plan plan,Payment payment) 
        Scanner sc = new Scanner(System.in);
System.out.println("                        ");
        System.out.println("WELCOME CUSTOMER ---");
        System.out.println("Enter your Mob No");
        Long Mob = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Email ");
        String email = sc.nextLine();

        Recharge recharge = new Recharge(Mob, "maharashtra GOA", email,
                new Plan("123- UNLIMITED 5G 1.5GB/DAY", 239.40, 28, "JIO OTT", "VI"),
                new Payment("UPI", 240.00, true));

        recharge.showRecharge();
    }
}
