package Exceptions_Generics.CompareObj;

public class Student87 implements Comparable <Student87>{

    int rollno;
    float marks;

    public Student87(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

//    comparing objects

    public static void main(String[] args) {
        Student87 yash = new Student87(12,86.9f);

        Student87 rahul = new Student87(45,54.36f);

//        checking whther the yash obj with rahul objecct
        if(yash.compareTo(rahul)<0)
        {
            System.out.println("yash has more marks");
        }

    }

//    overrding comaprable methods here
    @Override
    public int compareTo(Student87 o) {
        int diff = (int) (this.marks - o.marks);
//        if(diff==0) // both are equal
//        if diff<0 // means o is bigger else o is smaller
        return diff;
    }
}
