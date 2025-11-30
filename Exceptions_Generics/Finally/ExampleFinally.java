package Exceptions_Generics.Finally;

public class ExampleFinally {

    public static void main(String[] args) {
        System.out.println("MAIN Starts");
//        m1();


        for (int i = 1; i <= 5; i++) {

            try {
                System.out.println("try : " + i);
                if (i % 2 == 0) System.out.println(10 / 0);

            } catch (ArithmeticException e) {
                System.out.println("catch :" + i);
                System.exit(0);
//                break;
//                continue;
            } finally {
                System.out.println("finally " + i);

            }
            System.out.println("main ends");

        }


    }


//     public static void m1() {
//        System.out.println("m1() starts");
//
//        try {
//            System.out.println("try block ");
//            System.out.println(10/0);
//        } catch (Exception e) {
//            System.out.println("catch exception e");
//            return;
//        } finally {
//            System.out.println("finallys");
//        }
//        System.out.println("m1() ends");
//    }


    // public static void m1() {
    //     System.out.println("m1() starts");

    //     try {
    //         System.out.println("try block ");
    //         System.out.println();
    //     } catch (Exception e) {
    //         System.out.println("catch exception e");
    //     } finally {
    //         System.out.println("finallys");
    //     }
    //     System.out.println("m1() ends");
    // }
}
