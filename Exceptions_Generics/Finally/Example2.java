package Exceptions_Generics.Finally;

public class Example2 {
    public static void main(String[] args) {
//
//        try {
//            System.out.println("try");
//            System.out.println(10/0);
//
//        } catch (ArithmeticException e ) {
//            System.out.println("catch block 1");
//        String str = null;
//        str.length();
//        }
//        catch (Exception e){
//            System.out.println("catch block 2");
//        } finally{
//            System.out.println("finally block ");
//        }


//
//        try {
//            System.out.println("try");
//            System.out.println(10 / 0);
//
//        } catch (ArithmeticException e) {
//            System.out.println("outer catch block 1");
//
//            try{
//                System.out.println("inner try block");
//                System.out.println(args[0]);
//            }
//            catch(NullPointerException npe){
//                System.out.println("Inner catch ");
//            }
//        }   finally {
//            System.out.println("finally block ");
//        }


//        try{
//            System.out.println("outer try bloclk");
//            System.out.println(10/0);
//        }catch (ArithmeticException e){
//            System.out.println("outer catch block 1");
//            try{
//                System.out.println("inner try block ");
//                System.out.println(args[0]);
//            }catch (NullPointerException npe){
//                System.out.println("inner catch");
//            }
//        }catch (ArrayIndexOutOfBoundsException aife){
//            System.out.println("outer catch 2");
//        }
//        finally{
//            System.out.println("finally block");
//        }
//
//
//
//
        try{
            System.out.println("outer try bloclk");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("outer catch block 1");
            try{
                System.out.println("inner try block ");
                System.out.println(args[0]);
            }catch (NullPointerException npe){
                System.out.println("inner catch");
            }
        }catch (ArrayIndexOutOfBoundsException aife){
            System.out.println("outer catch 2");
        }
        finally{
            System.out.println("finally block");
        }

        System.out.println("main ends");
    }
}
