package Exceptions_Generics.Throwable;

public class ThrowsMethod {

    static void main() {



//        try{
//            int[]arr = {10,20,30,40};
//            arr[4] = 100000;
//        }catch (ArrayIndexOutOfBoundsException ar){
//            System.out.println(ar.getMessage());
//        }
        m1(2,0);
    }

    static void m1(int num1 ,int num2)
    {
        System.out.println("m1 starts ");
   try{
        System.out.println("try");
        if(num2 == 0){
            throw new ArithmeticException("myMessae");
        }
       System.out.println(num1/num2);
    }
    catch (ArithmeticException a){
        System.out.println("Catch");
        System.out.println(a.getClass().getName() + ":" + a.getMessage());
    }
//java.lang.ArithmeticException:myMessae

    }


}
