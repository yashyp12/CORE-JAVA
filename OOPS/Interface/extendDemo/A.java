package Interface.extendDemo;

public interface A {
    void fun();

    static void greet(){
        System.out.println("i am static method from A");
    };
    //from java 8 interfacese allows default methods

    default void funs(){
        System.out.println("i am in a defaut a");
    }
}

