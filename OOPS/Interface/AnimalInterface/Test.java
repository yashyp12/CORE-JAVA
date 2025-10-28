package Interface.AnimalInterface;

import Interface.MultipleInheritance.SmartPhone;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        // if we want to add some kind of methods in the instance
        //without breaking existing code we use default methods in the interface
        dog.run();

        Cat cat = new Cat();
        cat.eat();
        cat.run();
        System.out.println(Animal.MAX_SIZE);

//        static methods from the interface can be only call by interface only not by the implementing class
        // static methods of the interface can be only access by interface only
//        Animal.info();
//        dog.info();

        SmartPhone phone = new SmartPhone();
        phone.endCall();
        phone.takePhoto();
        phone.makeCall();
        phone.recordVideo();

    }
}
