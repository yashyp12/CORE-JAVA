package Comparators;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student implements Comparable<Student> {

    int rollNo;
    float marks;

    public Student(int rollNo,float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        //if diff == 0 means both are equal
            // if diff < 1 : means o is bigger else o is smaller
        return diff;
    }

    //comparing the objects
    static void main(String[] args) {
        Student yash = new Student(12,89.76f);
        Student rahul = new Student(15,90.76f);
        Student shubham = new Student(16,93.76f);
        Student rakesh = new Student(17,95.76f);
        Student sagar = new Student(18,97.76f);
            //IF BOTH ARE EQUAL then it wil be 0

        Student [] list = {yash,rahul,shubham,rakesh,sagar};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(yash.compareTo(rahul)<0){
            System.out.println("yp has more marks " + yash.compareTo(rahul));
        }

    }


}
