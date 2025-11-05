package Exceptions_Generics.ExceptionHandling;

public class Main {

    public static void main(String[] args){
        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            divide6(a, b);

//            throw new Exception("just for fun");

            String name = "Yash";
            if (name.equals("Yash")) {
                // throw new MyException("name is yash");
                throw new Exception("demo exception");
            }
        } catch (Exception e) {
//            throw new MyException("nAME IS YASH");
            System.out.println(e.getMessage());
        }
//    catch (Exception e){
//        System.out.println(e.getMessage());
//        }

//        Exception includes Everything - more strict has to add first
        // every exception comes in Exception
//         catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         } catch (Exception e) {
// //            catching normal exception
//             System.out.println("normal exception");
//         }
//        finally can be only one
        finally {
            System.out.println("thsi will alway execute");
        }

    }

    //throw - we are throwing an exceptio
    //throws - used to declare exception

    static int divide6(int a, int b) throws ArithmeticException {
//        return a / b;
        if (b == 0) {
//            to explicitly thro error something we can do this
            // throw new ArithmeticException("please do not divide by o");
        System.out.println(new ArithmeticException().getMessage());
        }
        return a / b;
    }
}
