package Collections;

public class ComparableEx {


//    Comparable - its an interface
    /*
    Comparable is an interface in Java that is used to define the default (natural) sorting order for the objects of a class.
    It tells how one object should be compared with another object of the same type.
     */


    public static void main(String[] args) {

        Student Yash = new Student(101, 36.54f);
        Student Rahul = new Student(102, 89.76f);

        if (Yash.compareTo(Rahul)<0) {
            System.out.println("RAHUL HAS MORE MARKS ");
        }

    }
}

//which type you wantt o comapre the student
class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
//        comapre with the marks
        int diff = (int)(this.marks - o.marks);

        //if diff = 0 means both are eual
        // if diff < 0 then o is bigger else o is smaller

        return diff;

    }
}
