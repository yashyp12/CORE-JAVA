package Exceptions_Generics.ExceptionHandlingExamp6;

public class MultipleCatchBlock1 {

    static void main(String[] args) {
//if teh error occuresisnnde the try inenr try then it checks first inenr the ncheck for the outer catch blocks
//        try{
//            System.out.println("outer try");
//
//            try{
//                System.out.println("inner trY");
//                System.out.println(args[0]);
//            }catch(Exception e){
//                System.out.println("inner catch");
//                System.out.println(10/0);
//            }
//        }
//        catch (ArithmeticException e){
//            System.out.println("outer catch 1");
//        }catch (RuntimeException e){
//            System.out.println("outer catch 2");
//        }


//        example 2
//        try{
//            System.out.println("outer try");
//
//            try{
//                System.out.println("inner try");
//                System.out.println(args[0]);
//            }catch (Exception e){
//                System.out.println("inner catch");
//                String []arr = new String[-1];
//            }
//        }
//        catch (ArithmeticException ae){
//            System.out.println("outer catch 1");
//        }catch(RuntimeException e){
//            System.out.println("outer catch 2");
//        }


//        examp 3
        try{
            System.out.println("outer tr");
            Thread.sleep(1000);

            try{
                System.out.println("inner try");
                System.out.println(10/0);
            }catch (NullPointerException e){
                System.out.println("inner catch");
            }
        }
        catch (InterruptedException e){
            System.out.println("outer catch 1");
        }catch (RuntimeException e ){
            System.out.println("outer  catch 2");
        }


    }
}
