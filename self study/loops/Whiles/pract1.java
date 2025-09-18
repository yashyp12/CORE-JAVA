import java.util.*;

public class pract1{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCost = 0;
        char wantToAddItems = 'Y';
        int ItemPrice = 10;
        int Quantity = 0;


        
        while(wantToAddItems == 'Y'){
            
            System.out.println("enter the quantity of item");
            Quantity = sc.nextInt();
            totalCost = Quantity*ItemPrice;
            System.out.println("your total bill is " + totalCost);

            System.out.println("do you want to add more items");
            wantToAddItems = sc.next().charAt(0);

        }

    }
}