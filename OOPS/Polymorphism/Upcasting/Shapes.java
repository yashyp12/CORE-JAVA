package Polymorphism.Upcasting;

// Upcasting = assigning child object to parent reference;
// only parent’s methods/variables are accessible,
// but overridden methods run from child at runtime (dynamic method dispatch).
class Animal {

    String name;
 
    void sound() {
        System.out.println("Some sound");
    }

}

class Dog extends Animal {

    @Override //optional 
    void sound() {
   
        System.out.println("Bark Bark !");
    }

    void demo() {
        System.out.println("i am child");
    }
}

public class Shapes {
    // upcasting -👉 Upcasting means:
// Assigning child object to a parent reference.
// (“Up” because you’re moving up in the inheritance chain.)

    public static void main(String[] args) {
        //its an upcasting storing the child obj in parent ref
        //now only the methods accesible which are in Animal parnet 
        //if its override by child then it will run the child version
//         Animal obj = new Dog();

// // look here the child hvae overridden one so that has been run
//         obj.sound();





    }

}
