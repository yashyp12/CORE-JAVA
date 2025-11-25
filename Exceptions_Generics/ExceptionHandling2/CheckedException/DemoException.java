package Exceptions_Generics.ExceptionHandling2.CheckedException;

//        class cast exeception
        class Parent{};
        class Child2 extends Parent{};
        class Child1 extends Parent{};
        class grandChild1 extends Child1{};
        class grandChild2 extends Child2{};

class DemoException {

    private static Child2 obj2;

    static void main(String[] args) {
        System.out.println("starts");

        Child1 obj = new grandChild1();
        Parent obj1 = (Child1) obj;

        try{
                   Child2 obj2 = (Child2) obj1;
        }catch(ClassCastException e){
            System.out.println("clas casr exceptio occured");
        }

        System.out.println("ends");



//        int a = 23;
//        int b = 23;
//        int c;
//
//        try {
//            c = a / 0;
//            System.out.println(c);
//        } catch (ArithmeticException e) {
//            System.out.println("error handled ");
//        }


    }
}
