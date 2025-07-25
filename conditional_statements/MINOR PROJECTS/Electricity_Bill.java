
import java.util.Scanner;

public class Electricity_Bill {

    //Input:
// Customer name
// Units consumed
// Logic:  0–100 units: ₹1/unit  || 101–300 units: ₹2/unit
// Above 300: ₹5/unit  || output Final bill
    static double bill;
    static String customerName;
    static double consumedUnit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE CUSTOMER NAME");
        customerName = sc.nextLine();

        System.out.println("How can we Help you ? 1.Customer Account 2.Electricity Bill");
        int option = sc.nextInt();

        switch (option) {

          

            case 1: {
                System.out.println("Showing the Customer Data");
                System.out.println("Customer Name is " + customerName);
                break;
            }

            //case 2 
            case 2: {

                System.out.println("Enter the units you have consumed this Month");
                consumedUnit = sc.nextDouble();

                if (consumedUnit <= 100) {
                    System.out.println("you have consumed " + consumedUnit + " unit");
                    bill = 1 * consumedUnit;
                    System.out.println(" so you will be charged bill is " + bill);
                } else if (consumedUnit >= 101 && consumedUnit <= 300) {
                    System.out.println("you have consumed " + consumedUnit + " unit");

                    bill = 2 * consumedUnit;
                    System.out.println("you will be Charged " + bill + "$");

                } else if (consumedUnit >= 300) {
                    System.out.println("you have consumed " + consumedUnit + "Units");

                    bill = 5 * consumedUnit;
                    System.out.println("you will be charged " + bill + "$");

                } else {
                    System.out.println("invalid unit entered , please try again !");

                }

                break;
            }

            default:{
                System.out.println("invalid input Entered");
                break;
            }

            
        }

        sc.close();

    }
}
