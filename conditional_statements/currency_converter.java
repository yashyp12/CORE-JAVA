import java.util.*;

public class currency_converter {

    // currency converter

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Welcome ");

            System.out.println("here is List of currencies    1.USD 2.BTC 3.EURO 4.ADA  5.DOGE 6.YEN 7.DOT");
            System.out.println("please enter your currency code here");
            String currency = sc.next().toUpperCase();
            double amount = 0;
            double converted_amt;


            // FOR USD CONVERSION
            if(currency.equals("USD") ) {
                System.out.println("you have choosed USD");

                System.out.println("enter your amount in INR");
                amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("invalid amount entered ");
                } else {

                    converted_amt = amount / 85.5670;
                    System.out.println("converted amount to USD is " + converted_amt);
                }


                // FOR BITCOIN CONVERSION
            } else if (currency.equals("BTC")) {
                System.out.println("hey you choosen BTC as currency");
                System.out.println("enter your inr amount");
                amount = sc.nextDouble();
                converted_amt = amount / 9535540;
                System.out.println("Total conversion are " + converted_amt);
                
            } 
            
            // FOR ada CONVERSION

            else if(currency.equals("ADA")){
                System.out.println("you coosed ADA (CARDANO)");
                System.out.println("enter your inr amount");
                amount=sc.nextDouble();
                converted_amt = amount / 56.1022;
                System.out.println("Total conversion are " + converted_amt);

            }
            else if (currency.equals("DOGE")) {
                System.out.println("you have choosn DOGE COIN");
                System.out.println("enter your amount here");
                amount = sc.nextDouble();
                converted_amt = amount/ 15.5835;
                System.out.println("Total conversion are " + converted_amt);

            }
            else if (currency.equals("YEN")) {
                System.out.println("you choosen JAPNESE YEN");
                System.out.println("enter your amount here");
                amount = sc.nextDouble();
                converted_amt = amount /1.70888;
                System.out.println("Total conversion are " + converted_amt);

            }
            else if(currency.equals("DOT"))
            {
                System.out.println("you choosen DOT ");
                System.out.println("enter your amount here");
                amount = sc.nextDouble();
                converted_amt = amount / 314.613;
                System.out.println("Total conversion are " + converted_amt);

            }
            
            else {
                System.out.println("sorry invalid or currency not available at this time");
            }

        }

    }

}
