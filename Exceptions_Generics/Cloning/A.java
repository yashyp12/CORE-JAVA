package Exceptions_Generics.Cloning;

public class A  {

    public static void main(String[] args) {
        Human yash = new Human(21, "yASH");
        Human twin = new Human(yash);


    }
}

class Human implements Cloneable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone () throws CloneNotSupportedException{
        return super.clone();
    }
}
