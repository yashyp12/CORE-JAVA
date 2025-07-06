import java.util.*;




//write program  to enter the distance to drive,fuel efficiency of car in miles per gallon
// the price per galoon, display the cost of the trip.


public class car_distance {
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the miles to drive"); //eg 900 miles so
      double distance = sc.nextDouble();


    //   so now we will take - how many miles are covered in 1 gallon(per gallon)
      System.out.println("enter the miles per galloon");
      double miles = sc.nextDouble();

    //   price of each galoon -> eg 3 then now will calculate how much price for the 900 miles/ miles per galoon - 25
    //means so 900/25 -> 36 , means 36 -> 1 galoon thats why we will multiply 36*price of 1 galoon - 3

    //so now 1 galoon - 
      System.out.println("enter the price per gallon");
      double price_pergallon = sc.nextDouble();

      double trip_cost = (distance/miles)*price_pergallon;
      System.out.println("total cost of trip is " + trip_cost);

    }
}
