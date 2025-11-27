package Exceptions_Generics.ExceptionHandlingExamp6;

public class MultipleCatchBlock1 {

    static void main(String[] args) {
//if teh error occuresisnnde the try inenr try then it checks first inenr the ncheck for the outer catch blocks
        try{
            System.out.println("outer try");

            try{
                System.out.println("inner trY");
                System.out.println(args[0]);
            }catch(Exception e){
                System.out.println("inner catch");
                System.out.println(10/0);
            }
        }
        catch (ArithmeticException e){
            System.out.println("outer catch 1");
        }catch (RuntimeException e){
            System.out.println("catch 2");
        }
    }
}
