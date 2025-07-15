
import java.util.Scanner;

public class BankManagement {

    //bank management system -> deposit, withdraw, balance check,create account,
    static double balance;
    static long Account_Number = (long) (Math.random() * 10000l);
    static String name;
    static int pin;
    static String username;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Welcome Dena Jana Bank Co-op Ltd");
            System.out.println("1.EXISTING CUSTOMER 2.CREATE ACCOUNT ");
            int userInput = sc.nextInt();

            switch (userInput) {

                case 1: {

                    if (name == null) {
                        System.out.println("Invalid user please Create your Acoount");
                        continue;
                    } 

                        System.out.println("login");
                        sc.nextLine();
                        System.out.println("Enter your username");
                        String user1 = sc.nextLine();
                    
                        System.out.println("Enter your pin");
                        int pin1 = sc.nextInt();
                      


                        if (pin1 == pin && user1.equals(username)) {

                            System.out.println("Login success !");

                            for (;;) {
                                System.out.println("OPERATIONS : 1.DEPOSIT, 2.WITHDRAW , 3.BALANCE 4.Logout 5.Account Info");
                                int userinp1 = sc.nextInt();

                                switch (userinp1) {

                                    case 1: {
                                        System.out.println("Enter the amount to deposit");
                                        double amtdepo = sc.nextDouble();
                                        balance += amtdepo;
                                        System.out.println("Amount Deposited Successfully");
                                        break;
                                    }

                                    case 2: {
                                        System.out.println("Enter the amount to Withdraw");
                                        double amtwithdraw = sc.nextDouble();

                                        System.out.println("Enter your  PIN");
                                        int pin2 = sc.nextInt();

                                        if(pin2 == pin){
                                            if(amtwithdraw<=balance){
                                                balance -=amtwithdraw;
                                                System.out.println("amount withdraw sucessfully");
                                            }
                                            else{
                                                System.out.println("insufficient balance");
                                            }
                                        }else{
                                            System.out.println("invalid PIN");
                                            continue;
                                        }

                                        break; 
                                    }

                                    case 3: {
                                        System.out.println("checking balance");
                                        System.out.println("Enter your PIN ");
                                        int pin3 = sc.nextInt();
                                        if(pin3 == pin){
                                            System.out.println("Availaible Balance " + balance);
                                            System.out.println("balance fethced successfully");

                                        }
                                        else{
                                            System.out.println("invalid pin");
                                            continue;
                                        }
                                        break;
                                    }

                                    case 4: {
                                        System.out.println("you are logout");
                                        return;
                                    }

                                    default: {
                                        System.out.println("invalid input entered");
                                    }
                                }

                            }

                        }

 
                }

                case 2: {
                    System.out.println("Create an Acoount");
                    System.out.println("Enter your username");
                    sc.nextLine();
                    username = sc.nextLine();
                    System.out.println("");
                    System.out.println("Set your PIN");
                    pin = sc.nextInt();
                    System.out.println("");
                    System.out.println("Enter your Name");
                    name = sc.nextLine();
                    System.out.println("Acoount Created succesfully Pleases Login");
                     
                }

                default:{
                    System.out.println("invalid Credentials ");
                    continue;
                }
            }
        }
    }
}
