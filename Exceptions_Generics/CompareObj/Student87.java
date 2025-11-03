package Exceptions_Generics.CompareObj;

import java.util.Arrays;
import java.util.Comparator;

public class Student87 implements Comparable<Student87> {

    int rollno;
    float marks;

    public Student87(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public String toString() {
//        now it will sort it based on the roll no
        return marks + "";
//        return rollno + " ";
    }


    //    comparing objects

    public static void main(String[] args) {
        Student87 yash = new Student87(12, 86.9f);
        Student87 rahul = new Student87(5, 77);
        Student87 karan = new Student87(12, 55);
        Student87 sachin = new Student87(5, 34);
        Student87 swapnil = new Student87(12, 99);


//        create arr of students
        Student87[] list = {yash, rahul, karan, sachin, swapnil};
//        System.out.println(Arrays.toString(list));

//        sorting bsaed on roll no
        /*
        But when you try to sort your Student87 objects,
         Java doesn't know your rules: Should Yash come before Rahul based on their rollno, their marks, or their names?
        The Comparable interface is a contract where you tell Java exactly how two objects should be ordered.

        2. The Comparable Contract
By adding implements Comparable<Student87> to your class signature, you agree to provide a specific method: compareTo(Student87 o).
The compareTo method dictates the sorting logic. When Java's sorting algorithms run, they repeatedly call your compareTo method to decide the correct order.

         */
//        Arrays.sort(list);
//        Arrays.sort(list, new Comparator<Student87>() {
//            @Override
//            public int compare(Student87 o1, Student87 o2) {
//                return (int) (o1.marks - o2.marks);
//            }
//        });


//        using the lamda expression
        Arrays.sort(list,(o1,o2) -> -(int)(o1.marks - o2.marks) );

        System.out.println(Arrays.toString(list));

//        checking whther the yash obj with rahul objecct
//        now if its negtaive from method comapre ot means other obj is bigger
//        if (yash.compareTo(rahul) < 0) {
//            System.out.println(yash.compareTo(rahul));
//            System.out.println("yash has more marks");
//        }

    }

    //    overrding comaprable methods here
    /*
    The Comparable interface doesn't do the sorting itself;
    it provides the rules for comparison that the built-in Java sorting algorithms (Arrays.sort, Collections.sort) use internally.
     */

    @Override
    public int compareTo(Student87 o) {
        System.out.println(" array sort checking in comapre to method");
        int diff = (int) (this.marks - o.marks);
//        if(diff==0) // both are equal
//        if diff<0 // means o is bigger else o is smaller
        return diff;
    }
}
