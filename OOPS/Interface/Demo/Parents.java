
public class Parents {

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.a);
    }

}

class Parent {

    static int a = 23;
}

class Child extends Parent {

    static int a = 43;

}
