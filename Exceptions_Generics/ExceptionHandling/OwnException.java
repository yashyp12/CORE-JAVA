package Exceptions_Generics.ExceptionHandling;

public class OwnException extends Exception{


   public OwnException(String mess){

        super(mess);
    }


}

class Demo43{
    static void main(String[] args)  {


       int a = 23;
        int b  = 0;

        try{
           int c= a/b;
        }catch (ArithmeticException e){
            System.out.println("Caught an arithmetic error. Details of custom exception:");
            OwnException obj = new OwnException("throws an error");
            obj.printStackTrace();
            System.out.println(e.getMessage());

        }catch (Exception ef){
            System.out.println("unexpected error occur");
        }

    }
}