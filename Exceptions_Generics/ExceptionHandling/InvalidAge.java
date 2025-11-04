package Exceptions_Generics.ExceptionHandling;

public class InvalidAge extends RuntimeException {
    public InvalidAge(String message) {
        super(message);
    }
}
