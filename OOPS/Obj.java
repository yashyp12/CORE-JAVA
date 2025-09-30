public class Obj {
    public static void main(String[] args) {
//STORES 5 ROLL NOS
        int[] numbers = new int[5];
        String[] names = new String[5];

// compile time = runtime
        Student yash = new Student();

        yash.rno = 12;
        yash.name = "patil";


        Student random = new Student(yash);

        System.out.println(random.name);
        Student a1 = new Student();
        Student a2 = a1;
//        a1.name = "raj";
        a2.name = "baba";
        System.out.println(a1.name);
        System.out.println(a2.name);

    }
}

//creating an class
class Student {
    int rno;
    String name;
    float marks;
//constructor overloading is also an part of polymorphism


//    internally
    Student() {
         this(23,"yash",45.36f);
    }

    //Student arpit = new Student(17,"Arpit",89.17);
//    here (this) will be replaced with arpit internally
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }



    //new keywrord memeory allocation


}






