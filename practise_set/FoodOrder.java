
import java.util.Scanner;

public class FoodOrder {

// Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

    /*  A vegetarian combo costs $12 per plate
 and a non-vegetarian combo costs $15 per plate. 
 Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
/* 
 * first 3km - 0
 * next 3km - 1
 * remaing km - 2
 * 
 * Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int rate = 12;
        // int nrate = 15;

        int rate = 0;
        int total = 0;
        System.out.println("Welcome into our Hotel !");
        System.out.println("Enter the type of Food Vegeterian OR Non Vegeterian (Y/N) ");
        char food = sc.next().toUpperCase().charAt(0);

        if (food == 'Y') {
            rate = 12;
        } else if (food == 'N') {
            rate = 15;
        } else {
            System.out.println("invalid char entered");

        }

        System.out.println("Enter the Distance from Hotel");
        double distance = sc.nextDouble();

        System.out.println("enter the quantity of Food");
        int quantity = sc.nextInt();

        if (quantity < 1) {
            System.out.println("invalid quantity please enter apropriate one ");
        }
        //

        if (distance <= 3) {
            System.out.println("you will be charged for delievery is 0");
            total = rate * quantity;
            System.out.println("your total bill is " + total);

        } else if (distance > 3 && distance <= 6) {
            System.out.println("you will be charged rs 1 ");
            rate += 1;

            total = rate * quantity;
            System.out.println("so your total bill is " + total);

        } else {
            System.out.println("you will be charged 2");
            rate += 2;

            total = rate * quantity;
            System.out.println(total);
            System.out.println("your total bill is " + total);

        }

    }
}
