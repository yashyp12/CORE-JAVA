import java.util.*;

abstract class Order {
    int basePrice;

    abstract void prepareFood();

    int extraCheese() {
        System.out.println("Extra Cheese added (+₹40)");
        return 40;
    }

    int seasoning() {
        System.out.println("Seasoning added (+₹10)");
        return 10;
    }
}

// Child classes
class Pizza extends Order {
    Pizza() { basePrice = 100; }
    void prepareFood() { System.out.println("Preparing Pizza..."); }
}

class Burger extends Order {
    Burger() { basePrice = 50; }
    void prepareFood() { System.out.println("Preparing Burger..."); }
}

class Vadapav extends Order {
    Vadapav() { basePrice = 20; }
    void prepareFood() { System.out.println("Preparing Vada Pav..."); }
}

class ChickenBiryani extends Order {
    ChickenBiryani() { basePrice = 150; }
    void prepareFood() { System.out.println("Preparing Chicken Biryani..."); }
}


public class DriverClassOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBill = 0;   // store total directly

        while (true) {

            System.out.println("\n--------- Food Menu ---------");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Vada Pav");
            System.out.println("4. Chicken Biryani");
            System.out.println("5. Exit & Print Receipt");
            System.out.println("-----------------------------");
            System.out.print("Enter choice : ");

            int ch = sc.nextInt();
            Order item = null;

            switch (ch) {
                case 1 -> item = new Pizza();
                case 2 -> item = new Burger();
                case 3 -> item = new Vadapav();
                case 4 -> item = new ChickenBiryani();
                case 5 -> {
                    // Print receipt inside switch
                    System.out.println("\n========== FINAL RECEIPT ==========");
                    System.out.println("TOTAL AMOUNT = ₹" + totalBill);
                    System.out.println("===================================");
                    System.out.println("Thank you! Visit again!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice!");
                    continue;
                }
            }

            // Prepare food
            item.prepareFood();
            int bill = item.basePrice;

            // Extra cheese?
            System.out.print("Do you want Extra Cheese (yes/no)? ");
            if (sc.next().equalsIgnoreCase("yes")) {
                bill += item.extraCheese();
            }

            // Seasoning?
            System.out.print("Do you want Seasoning (yes/no)? ");
            if (sc.next().equalsIgnoreCase("yes")) {
                bill += item.seasoning();
            }

            System.out.println("Item Added | Bill = ₹" + bill);

            totalBill += bill;   // add each bill directly into total
        }
    }
}