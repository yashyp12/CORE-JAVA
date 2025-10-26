package Interface;

public interface Engine {

    //    by default it is final and static
    static final int PRICE = 780000;
    int a =23;
    void start();

//    default void demo(){
//        System.out.println("i am demo one");
//    }
//
//    static void demo1(){
////        static methods are allowed
//        System.out.println("i am static");
//    }

    void stop();

    void acc();

    void brake();
}

