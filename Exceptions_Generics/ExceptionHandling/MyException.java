
public class MyException {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        // try {
        // int c = a / b;

        // } catch (Exception e) {
        // // System.out.println(new Exception("error num zero bhai"));
        // System.out.println(e.getMessage());

        // }

        int age = 20;

        try {
            multiply45(a, b);

        } catch (MyExceptNew e) {
            System.out.println(e.getMessage());
        }
        // try {

        // demo56.ageValidate(age);

        // } catch (InvalidAgeException e) {
        // System.out.println(e.getMessage());

        // }
        // } catch (Exception e) {
        // System.out.println(e.getMessage());

        // }

    }

    // its an unchcked exception
    public static void multiply45(int num1, int num2) throws MyExceptNew {

        if (num1 < num2) {
            throw new MyExceptNew("error shown");
        }

    }
}

class demo56 {
    static void ageValidate(int age) throws InvalidAgeException {
        if (age < 25) {
            throw new InvalidAgeException("error age");
        }
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String messsage) {
        super(messsage);
    }

}

class MultiplyZeroException extends RuntimeException {
    public MultiplyZeroException(String message) {
        super(message);
    }
}

class MyExceptNew extends Exception {
    public MyExceptNew(String message) {
        super(message);
    }
}