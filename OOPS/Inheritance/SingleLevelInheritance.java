
class Vehicle {

    String brand;
    String model;
    double price;
    String manufacturingDate;

    Vehicle(String brand, String model, double price, String manufacturingDate) {
        super();
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    public void getVehicleDetails() {
        System.out.println("------------------");

        System.out.println("Vehicle Details ");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("manufacturingDate : " + manufacturingDate);

    }
}

class Car extends Vehicle {

    boolean ac;
    int airBags;
    int doors;
    boolean sunroof;
    String fuelType;

    Car(boolean ac, int airBags, int doors, boolean sunroof, String fuelType,
            String brand, String model, double price, String manufacturingDate) {
        super(brand, model, price, manufacturingDate);

        this.ac = ac;
        this.airBags = airBags;
        this.doors = doors;
        this.sunroof = sunroof;
        this.fuelType = fuelType;
    }

    public void getCarDetails() {
        System.out.println("------------------");
        System.out.println("Car Details ");
        System.out.println("AC : " + ac);
        System.out.println("airBags : " + airBags);
        System.out.println("Doors : " + doors);
        System.out.println("Sunroof : " + sunroof);
        System.out.println("FuelType : " + fuelType);
    }

    public void vehicleStart() {
        System.out.println("Press the button to Start Car");
    }

    public void accelerate() {
        System.out.println("Use a pedal to move vehicle");
    }
}

class SingleLevelInheritance {

    public static void main(String[] args) {
        Car obj = new Car(true, 3, 4, true, "Petrol", "TATA", "SAFARI", 2500000, "AUG 2025");
        obj.getVehicleDetails();
        obj.getCarDetails();
        obj.accelerate();

    }
}
