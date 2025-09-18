
import java.util.Scanner;

public class FoodOrder {

    //Consider the code given below. The number of food items to be ordered is accepted as an input from the customer. Let us assume that the customer has only $40 with him. So, the loop should be terminated when the total cost of food items goes beyond $40. In this scenario, break statement can be used to terminate the loop.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int price;
        System.out.println("Welcome into Restaurant ");
        System.out.println("Enter your budget Limit");
        int budget = sc.nextInt();

     
            innerLoop:
            for (;;) {
                int fquantity;
                System.out.println("Add item which you want to Order ");
                System.out.println("1 - PANEER MASALA , 2- SHEV BHAJI  3 - Exit");

                int item = sc.nextInt();
                // switch cases 
                switch (item) {
                    case 1 ->
                        System.out.println("Paneer Masala -> 40 $");
                    case 2 ->
                        System.out.println("Shev bhaji -> 50$");
                    case 3 ->
                        System.out.println("Thank you for your time ");
                    default ->
                        System.out.println("Not aval");
                };

                if (item == 1) {
                    System.out.println("Enter the qty");
                    fquantity = sc.nextInt();
                    price = 40;
                    total += fquantity * price;
                    System.out.println("total price is " + total);
                    
                    
                } else if (item == 2) {
                    System.out.println("Enter the qty");
                    fquantity = sc.nextInt();
                    price = 20;
                    total += fquantity * price;
                    System.out.println("Toal price is " + total);
                } else if (item == 3) {
                    break ;
                }

                if (total >= budget) {
                    System.out.println("you have exeed the budget your total bill is " + total);
                    break innerLoop;
                }

                sc.close();

            }

        }

    }
 