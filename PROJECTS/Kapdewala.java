
import java.util.ArrayList;
import java.util.Scanner;

public class Kapdewala {

 
    static String username = "";
    static String password = "";
    static String name = "";
    static Scanner sc = new Scanner(System.in);
    static int TotalBill = 0;

    //creating an arryalist which stores the object flexible can shrink
    static ArrayList<String> cart = new ArrayList<>();

    //ArrayList <datatype> array name = new arrayname ->creating an object of array
// ecommmerce n
    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to Kapdewala !");
            System.out.println("1.Register 2.Login 3.View Cart 4.EXIT");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    register();
                    break;

                case "2":
                    login();
                    break;

                case "3":
                    showCart();
                    break;

                case "4":
                    return;

                default:
                    System.out.println("invalid option entered");
                    break;

            }

        }
    }

    //register
    static void register() {
        System.out.println("set your username");
        username = sc.nextLine();
        System.out.println();
        System.out.println("set your password");
        password = sc.nextLine();
        System.out.println();
        System.out.println("you are registered succesfully login again!");
    }

    //login 
    static void login() {
        if (username.isEmpty()) {
            System.out.println("no user registered Register first");
            return;
        }

        int Attempt = 3;
        while (Attempt > 0) {

            System.out.println("enter your username");
            String user = sc.nextLine();
            System.out.println("Enter your Password");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("logged in succesfully !");
                home();
                return; //succeess

            } else {
                Attempt--;
                if (Attempt > 0) {
                    System.out.println("incorrect pass your remaining attempts are " + Attempt);
                } else if (Attempt == 0) {

                    System.out.println("you have exhausted the limits");
                }
            }
        }

    }

// home 
    static void home() {
        while (true) {

            System.out.println("welcome to home");
            System.out.println("what you want to purchase");
            System.out.println("1 . Mens Section , 2.Women Section 3.VIEW CART 4.ADD CART 5.ORDERS 6 WISHLIST 7 EXIT");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    mensSection();
                    break;

                case "2":
                    womensSection();
                    break;
                case "3":
                    showCart();
                    break;

                case "7":
                    return;

                default:
                    System.out.println("invalid input");
                    break;
            };
        }

    }

    //men section
    static void mensSection() {

        while (true) {
            System.out.println("welcoome into mens section");
            System.out.println("1.CLOTHES 2.FOOTWEAR 3.ACCESORIES 4 HOME ");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    menCloth();
                    break;
                case "2":
                    footwears();
                    break;
                case "3":
                    accesories();
                    break;
                case "4":
                    return;

                default:
                    System.out.println("invalid input");
            }
        }

    }

    // accesories section - men
    static void accesories() {

        while (true) {

        }

    }

    //footweares section - men
    static void footwears() {
        System.out.println("choose some items to buy");
        while (true) {

        }
    }

// men clothes
    static void menCloth() {


        while (true) {

            System.out.println("choose cloths to buy");

            System.out.println("101.TSHIRT 799 || 102.PANT 599 || 103 , SHIRT 500 4.BACK");
            String prodid = sc.nextLine();

            switch (prodid) {
                case "101":
                    addCart(prodid, 799);
                    break;
                case "102":
                    addCart(prodid, 599);
                    break;
                case "103":
                    addCart(prodid, 500);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("invalid input");
            }
        }

    }

    // add Cart()
    static void addCart(String item, int price) {

        cart.add(item);
        TotalBill += price;
        System.out.println("product is added inside the Cart");
    }

    //women section
    static void womensSection() {
        System.out.println("welcome into womens section");
    }

    static void showCart() {
        System.out.println("CART");
        if (cart.isEmpty()) {
            System.out.println("cart is emptys");
            return;
        }
        System.out.println("item in Cart");
        for (String item : cart) {
            System.out.println(item);

        }

        System.out.println("total bill is " + TotalBill);

        System.out.println("do you want to remove product from the Cart y/n?");
        String res = sc.next();

        if (res.equalsIgnoreCase("Y")) {
            System.out.println("enter the product id ");
            int proid = sc.nextInt();

            if (removeProduct(proid)) {
                System.out.println("product has been removed");
            }

        }
    }

    static boolean removeProduct(int pid) {
        return true;
    }
}
