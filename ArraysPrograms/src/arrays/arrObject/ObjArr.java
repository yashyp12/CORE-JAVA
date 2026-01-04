package arrays.arrObject;


import java.util.Arrays;

class Student {

    String name;
    int id;
    int age;
    double per;
    String college;

    Student() {
    }

    public Student(String name, int id, int age, double per, String college) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.per = per;
        this.college = college;
    }
}

public class ObjArr {
    static void main(String[] args) {
        Student[] db = new Student[2];
        System.out.println(Arrays.toString(db));
        db[0] = new Student();
        db[1] = new Student();
        db[0].name = "Yash";
//        System.out.println( db[0].name);

    }
}
