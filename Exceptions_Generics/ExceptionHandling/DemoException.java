package Exceptions_Generics.ExceptionHandling;

public class DemoException {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            withdraw(a);
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }

    }

    static void withdraw(int amount) throws InsufficientFundsException1 {
        if (amount < 100) {
            throw new InsufficientFundsException1("invalid amount");
             
        }
    }

}

class InsufficientFundsException1 extends RuntimeException {

    public InsufficientFundsException1(String message) {
        super(message);
    }

}