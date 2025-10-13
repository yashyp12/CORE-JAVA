package Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();


//    polymorphism


        square.area();
        circle.area();

    }
}

