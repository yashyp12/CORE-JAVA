package Polymorphism.RuntimePoly;

class Shapes {

    void area() {
        System.out.println("area is pie r ");
    }

}

class Circle extends Shapes {
//this will have priority whenver the obj of circle is created
//hence it is overriding the parent method

    @Override
        //this is called annotation
    void area() {
        System.out.println("area is pie r  i am circle");
    }
}

class Square extends Shapes {

    @Override
    void area() {
        System.out.println("side 2 i am square");
    }
}

public class Main {

    public static void main(String[] args) {

        // type of method in overriding that is called is depend on type of objects
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        square.area();
// whatever is being access ddoes not depend on the obj type , 
// depends upon the ref type
//but which one is access is depend on the type of obj
/*
overriding means - type is the ref var as the parent class
but the obj is of type is subclass

 */

    }
}
