package Abstraction1;

public class abstractDemo {


    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();

//        Daughter daughter = new Daughter(20);
//        daughter.career();

//        Parent mom = new Parent();
//        Can we create static methods in abstract classses
        Parent.Hello();

        Parent daughter = new Daughter(28);
        daughter.career();


//        trying to call a parent abstract class constructor onlt when the subclass instance is created
        Sister sister = new Sister();

    }
}

  abstract class Parent {
    int age;

    public Parent() {
        System.out.println("i am a constructor of parent one");
    }

    //        can we create abstract constructors
//Can we create static methods in abstract classses
    static void Hello() {
        System.out.println("hello");
    }

    //    it can contain the normal methods
    void normal() {

    }

    public Parent(int age) {
        this.age = age;
    }

    abstract void career();

    abstract void Partner();

}

class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i am going to be a  doctor");
    }

    @Override
    void Partner() {
        System.out.println("i love xyz");
    }
}

class Daughter extends Parent {

    public Daughter(int age) {
        super(age);

    }

    @Override
    void career() {
        System.out.println("i am going to be coder ");
    }

    @Override
    void Partner() {
        System.out.println("i am love to cars ");
    }

    void sister() {
        System.out.println("i am a sister");
    }
}

class Sister extends Parent{

    public Sister(){
        super();
    }

    @Override
    void career() {
        System.out.println("sister careers");
    }
    @Override
    void Partner() {
        System.out.println("sister partner");
    }


}