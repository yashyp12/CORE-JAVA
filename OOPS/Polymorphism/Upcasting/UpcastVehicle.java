public class UpcastVehicle {

    public static void main(String[] args) {

        Vehicle obj1 = new Car("Car");
        Vehicle obj2 = new Bike("Bike");
        Vehicle obj3 = new Bus("Bus");

        obj1.start();
        obj2.start();
        obj3.start();

    }
}

class Vehicle {

    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + " vehicle start");
    }
}

class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public void start() {
        System.out.println(name + " vehicle start using key");
    }

}

class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    public void start() {
        System.out.println(name + " vehicle start using kick");
    }

}

class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    public void start() {
        System.out.println(name + " vehicle start using button");
    }

}

