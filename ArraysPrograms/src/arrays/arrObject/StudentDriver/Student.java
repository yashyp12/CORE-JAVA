package arrays.arrObject.StudentDriver;

public class Student {
    String name;
    int age;
    int id;
    double per;
    String college;

    public Student(String name, int age, int id, double per, String college) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.per = per;
        this.college = college;
    }

    @Override
    public String toString(){
        return "["+name+" " + age + " "+ id+" "+" " + college + " ]";
    }

}
