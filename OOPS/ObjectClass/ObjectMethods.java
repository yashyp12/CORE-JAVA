package ObjectClass;


class Student {

    int id;
    String name;

    public Student() {
    }


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public boolean equals(Object o){
////        we need to downcast it because we wnat to access the child classs methods or data member thats why
//        Student s = (Student)o;
//
//        return this.id == s.id && this.name == s.name;
//    }

    @Override
    public int hashCode(){
        return id + name.hashCode();
    }
}


public class ObjectMethods {



    public static void main(String[] args) {
        Student s1 = new Student(235, "Raju");
        Student s2 = new Student(235, "Raju");


//default format of toStrign is FullyQualifiedClassName@HexadecimalHashCode

//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        System.out.println(s1);
//        System.out.println(s2);

//        System.out.println(s1.equals(s2));
//
//        System.out.println(s1.hashCode()); // if both one contains same data the mehtod will return the same hashcode
//        System.out.println(s2.hashCode()); // prints unique hashcode for both

        String s45 = "Yash";
        String s46 = "Yash";
////        here string class is override the equals method
//        The String class overrides the equals() method from the Object class.
//It does not check memory — it checks whether the sequence of characters inside both strings is the same.
//
//Here’s roughly how it’s implemented inside Java’s String class:
        System.out.println(s45.equals(s46));


    }
}
