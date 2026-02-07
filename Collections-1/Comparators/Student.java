package Comparators;

public class Student implements Comparable<Student> {

    int rollNo;
    float marks;

    public Student(int rollNo,float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
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
        Student yp = new Student(15,90.76f);
            //IF BOTH ARE EQUAL then it wil be 0
        if(yash.compareTo(yp)<0){
            System.out.println("yp has more marks " + yash.compareTo(yp));
        }

    }


}
