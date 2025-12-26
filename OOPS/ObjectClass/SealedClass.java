package ObjectClass;

public sealed class SealedClass permits demo1,demo2 {

    static void m1(){
        System.out.println("m1 is there");
    }
}

final class demo1 extends SealedClass{
    static void main(String[] args) {
        m1();
        System.out.println("i am from demo1");
    }
}

final class demo2 extends SealedClass{
    static void main(String[] args) {
        m1();
        System.out.println("i am from demo2");
    }
}



