package loops.Whiles;

import java.util.Scanner;

public class dowhilea {
    // When the loop has to be executed at least once before the condition is checked, do-while loop is used. After the first execution, the loop then gets repeated as long as the condition is true. In case of do-while loop, the condition is tested after executing the code block. Hence, it is called an exit-controlled loop. 
    // do while loop 

    public static void main(String[] args) {
        int totalCost = 0;
        int unitPrice = 10;
        int quantity = 0;
        char addItems = 'Y' ;
        
        Scanner sc = new Scanner(System.in);

      
do { 
    
    System.out.println("enter the quantity");
    quantity = sc.nextInt();
    System.out.println("order placed successfully");
    
    
    totalCost =totalCost +  quantity*unitPrice;
    System.out.println("your Total Bill is " + totalCost);
    System.out.println("do you want to add items");
    addItems = sc.next().charAt(0);

} while (addItems == 'Y');

System.out.println("thank you for ordering ");
    }

}
