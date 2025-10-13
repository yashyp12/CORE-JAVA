package Inheritance.Polymorphism;

public class Numbers {
//compile time polymorphism where java decides what to run at compile time


/*
Java looks for a method that matches exactly the types you passed in.

You passed two ints → sum(int, int) perfectly matches method #3.
✅ So Java directly picks that one.
It won’t even consider sum(double, int) because int, int already has an exact match.

🧮 But if you didn’t have sum(int, int) defined,

then the compiler would look for the closest match.

Here, it sees:

sum(double, int) is possible because Java can implicitly widen your first int to a double.
So your sum(2, 4) would become sum(2.0, 4) behind the scenes.
 */
    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a,int b){
        return a + b;
    }


    public static void main(String[] args) {

        Numbers obj = new Numbers() ;
        //this is happening due to type casting , implciitly
        //but if i had one of the antoehr method with int param then that will run only
        System.out.println(obj.sum(2,4));
        obj.sum(2,5,6);
    }
}


