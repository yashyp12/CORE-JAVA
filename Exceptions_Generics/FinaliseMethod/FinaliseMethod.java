package Exceptions_Generics.FinaliseMethod;

class Student{

    String name;
    String id;
    Student(String name,String id){
        super();
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return id + " " + name;
    }

    @Override
    public void finalize() throws Throwable
    {
        System.out.println(10/0);
        System.out.println("object removed ");
    }
}



public class FinaliseMethod {

    static void main(String[] args) {
        System.out.println("execution started");
        Student obj = new Student("Yash","24");
        System.out.println(obj);
        obj = null;
        System.gc();
        System.out.println("Execution ends");
        System.out.println(Thread.currentThread());
    }
}
