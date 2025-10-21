package SingleTonClass;

import Access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(25, "Yash Patil");
//        if the member is protected outside the package you can only acces it via its subclass
        SubClass obj1 = new SubClass(25, "Yash Patil");
        int n = obj1.num;

        System.out.println(obj1 instanceof Object);

    }

}


// either subclasss of or subclass of itself
//class SubSubClass extends SubClass{
//    public SubSubClass(int num, String name) {
//        super(num, name);
//    }
//
//    public static void main(String[] args) {
//         SubSubClass obj = new SubSubClass(25, "Yash Patil");
//         int n = obj.num;
//
//        System.out.println(obj instanceof SubSubClass);
//    }
//}
