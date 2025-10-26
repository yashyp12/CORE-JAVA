package Interface.extendDemo;

public interface A {
    void fun();

    //from java 8 interfacese allows default methods

    default void funs(){
        System.out.println("i am in a defaut a");
    }
}

