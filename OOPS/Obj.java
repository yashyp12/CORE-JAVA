public class Obj{
public static void main(String[] args) {
//STORES 5 ROLL NOS
    int [] numbers = new int[5];
    String [] names = new String[5];

// compile time = runtime
Student yash = new Student();

yash.rno = 12;
yash.name = "patil";



}
}

//creating an class
    class Student {
    int rno ;
    String  name ;
    float  marks ;

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}






