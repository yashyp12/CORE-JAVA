package Exceptions_Generics.CustomException.BankApp;

import java.util.Scanner;

class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(String descc){
        super(descc);
    }
}

class InvalidPinException extends RuntimeException{
    InvalidPinException(String desc){
        super(desc);
    }
}


class Bank{
private String name;
private String pin;
private double balance;

    public Bank(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double amt){
        this.balance +=amt;
        System.out.println("AMOUNT DEPOSITED");
    }

    public void withdraw(double amt){
        if(amt>this.balance){
            throw new InsufficientFundsException("insufficent funds in ac");
        }
        this.balance -=amt;
        System.out.println("Amt Withdraw");
    }

    public double getBalance(String pin){
        if(pin.equals(this.pin)){
            return this.balance;
        }
        throw new InvalidPinException("invalid pin");
    }
}



public class BankDriver {
    public static void main(String[] args) {
    Bank bank = new Bank("YASH","123",2000);
    for (;;){
        System.out.println("WELCOME TO BANK");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. CHECK BALANCE");
        System.out.println("Enter option : ");

        switch (new Scanner(System.in).nextInt())
        {
            case 1 -> {
                System.out.println("Enter amount :");
                bank.deposit(new Scanner(System.in).nextDouble());
                break;
            }

            case 2 ->{
                System.out.println("Enter Amount : ");
                bank.withdraw(new Scanner(System.in).nextDouble());
                break;
            }

            case 3 ->{
                System.out.println("Enter PIN :");
                double balance = bank.getBalance(new Scanner(System.in).next());
                System.out.println("Your Balance is : " + balance + "rs .");
                break;
            }
        }
    }
    }
}
