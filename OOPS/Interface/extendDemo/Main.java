package Interface.extendDemo;


public class Main implements B {


//    now as we have implemented B we need to override
    // methods from both the interfaces

    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

    public static void main(String[] args) {

//        it will still prirotize the B because we are implementing b if  b does not contain funs then itwill consider A
        /*
        the child interface does not hide the parent methods.
        Instead, the following rule, known as "subinterface takes priority,"
        applies: the default method in the more specific (child) interface overrides the one from the less specific (parent)
         */
//        A b = new Main();
//        b.funs();


        Main obj = new Main();
//        static methods can be call via interface name
        A.greet();
    }

}
