package demo;

public class DemoMain {
    String name;

    DemoMain(String name) {
        this.name = name;
        System.out.println("i am parent constructor");
        super();
    }

    public static void main(String[] args) {
        System.out.println();
        Demo d = new Demo("Yash",21 );
    }
}


class Demo extends DemoMain {
    int age;
    String name;

//    Demo(String name){
//        System.out.println("its a name");
//    }
    Demo(String name, int age) {
        System.out.println("i am a constructor");
        this.name=name;
        this.age = age;
        System.out.println(age);
        super(name);
    }
}
