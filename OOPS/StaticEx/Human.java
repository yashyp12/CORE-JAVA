package StaticEx;

public class Human {

    int age;
    String name;
    static int salary;
    boolean status;

    public Human(int age, String name, int salary, boolean status) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.status = status;

    }

    public static void main(String[] args) {
        Human mc = new Human(12,"yash",45,true);
    }

    static void show(){
        System.out.println("i am an static method");
    }
}
