
import java.util.*;

class Driver {
//gives driver details

    private String name;
    private Long contact;

    Driver(String name, Long contact) {
        this.name = name;
        this.contact = contact;
    }

//getter for fetching driver details
    public void getDriver() {
        System.out.println("\n Driver Info");
        System.out.println("Driver Name " + name);
        System.out.println("Contact : " + contact);
    }

    @Override
    public String toString() {
        return name + " (" + contact + ")";
    }

}

class Cab {

    static int id = 1212;
    private Driver driver;
    private String number;
    private String uberId;
    private String type;
    private int capacity;
    private String status = "AVAIL";
    private String location = "DECCAN";

    String[] typeVehicle = {"hatchback", "sedan", "suv", "muv"};
    int[] vehicleCapacity = {3, 4, 5, 6};

    {
        //this will give an unqieu id executes first when obj created
        this.uberId = "UBER" + id++;
    }

    Cab(String number, String type, Driver driver) {

        this.number = number;
        this.type = type.toLowerCase();

        int indx = 0;
        for (String element : typeVehicle) {
            if (type.toLowerCase().equals(element)) {
                break;
            }
            indx++;
        }

        this.capacity = vehicleCapacity[indx];
        this.driver = driver;

    }

    public void getCabDetails() {
        System.out.println(
                "N CAB DETAILS");
        System.out.println("Uber Id : " + uberId);
        System.out.println("Status " + status);
        System.out.println("Type :" + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Location " + location);
        System.out.println("");
    }

    public String getCabNumber() {
        return number;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getUberId() {
        return uberId;
    }

}

class Passenger {

    private String name; //get set
    private long contact;
    private String email;
    private String pickupLocation;
    private String dropLocation;
    private int seats;

    Passenger(String name, Long contact, String email,
            String pickupLocation, String dropLocation, int seats) {
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long newContact) {
        this.contact = newContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String newPickupLocation) {
        this.pickupLocation = newPickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String newDropLocation) {
        this.dropLocation = newDropLocation;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int newSeats) {
        this.seats = newSeats;

    }

}

// ride history - 
class Ride {

    private String pickup;
    private String drop;
    private double fare;
    private String status;
    private String cabNumber;
    private String driverName;

    Cab cab;

    Ride(String pickup, String drop, double fare, String status, Cab cab) {
        this.pickup = pickup;
        this.drop = drop;
        this.fare = fare;
        this.status = status;
        this.cabNumber = cab.getCabNumber();
        this.driverName = cab.getDriver().toString();
    }

    public void printRide() {
        System.out.println("-------Ride Summary-------");
        System.out.println("pickup : " + pickup + "Drop: " + drop);
        System.out.println("Fare: " + fare + " Status " + status);
        System.out.println("Cab: " + cabNumber + " Driver: " + driverName);
        ;
    }
}

class Uber {

    String[] stops = {"DECCAN", "MANPA", "SHIVAJINAGAR", "SANGAMWADI", "YERWADA"};
    int[] distances = {0, 2, 4, 7, 9};

    ArrayList<Cab> listCabs = new ArrayList<Cab>();
    Passenger passenger;
    Cab currentCab;

    ArrayList<Ride> rideHistory = new ArrayList<>();

    // for calling an addPassenger func first
    {
        addPassenger();
    }

    {
        Cab cab1 = new Cab("MH-01-AA-1234", "sedan", new Driver("Ramesh Kumar", 9876543210L));
        Cab cab2 = new Cab("MH-12-AA-2323", "suv", new Driver("Suresh Kumar", 9876543210L));
        Cab cab3 = new Cab("MH-24-AA-1334", "hatchback", new Driver("Ganesh Kumar", 9876543210L));
        Cab cab4 = new Cab("MH-01-AA-1634", "muv", new Driver("Mukesh Kumar", 9876543210L));
        Cab cab5 = new Cab("MH-05-Ab-1664", "sedan", new Driver("Rajesh Kumar", 9876543210L));
        Cab cab6 = new Cab("MH-19-YP-1212", "hatchback", new Driver("Hitesh Kumar", 9876543210L));

        listCabs.add(cab1);
        listCabs.add(cab2);
        listCabs.add(cab3);
        listCabs.add(cab4);
        listCabs.add(cab5);
        listCabs.add(cab6);
    }

//getting details of passengers
    public void addPassenger() {
        System.out.print("Passenger Details ");
        System.out.print("Name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Contact   ");
        Long contact = new Scanner(System.in).nextLong();
        System.out.print("Email ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("Pickup Location : ");
        String pickup = new Scanner(System.in).nextLine().toUpperCase();
        System.out.println("Drop Location : ");
        String drop = new Scanner(System.in).nextLine().toUpperCase();
        System.out.println("No of people ");
        int seats = new Scanner(System.in).nextInt();

        // passing data to the passenger constructor
        this.passenger = new Passenger(name, contact, email, pickup, drop, seats);
    }

    public void homeModule() {
        for (;;) {
            System.out.println("\n Welcome");
            System.out.println("1. Book a Ride ");
            System.out.println("2. Cancel a Ride ");
            System.out.println("3. Ride History ");
            System.out.println("4 . Logout \n");
            System.out.println("Enter your responce :");
            int response = new Scanner(System.in).nextInt();

            switch (response) {
                case 1 ->
                    bookRide();
                case 2 ->
                    cancelRide();
                case 3 ->
                    rideHistory();
                case 4 -> {
                    System.out.println("thank you visit again !");
                    System.exit(0);
                }
                default ->
                    System.out.println("invalid responce");

            }
        }
    }

    public void bookRide() {

        if (passenger == null) {
            addPassenger();
        }

        System.out.println("\n Book-A-Ride Module");
        for (Cab element : listCabs) {
            if (element.getStatus().equals("AVAIL")
                    && passenger.getSeats() <= element.getCapacity()) {
                element.getCabDetails();
            }
        }

        System.out.println("\n Enter the uberId : ");
        String uberId = new Scanner(System.in).next();
        boolean assump = false;

        for (Cab ele : listCabs) {
            if (ele.getUberId().equals(uberId)) {
                System.out.println("your ride has been confirmed");
                currentCab = ele;
                assump = true;
                System.out.println("your ride details ");
                ele.getCabDetails();
                System.out.println("Cab Number: " + ele.getCabNumber());
                ele.getDriver();
// fare
                double fare = calculateFare(passenger.getPickupLocation(), passenger.getDropLocation());
                System.out.println("Pickup :" + passenger.getPickupLocation());
                System.out.println("Drop : " + passenger.getDropLocation());
                System.out.println("Fare is : " + fare + "rs ");

                // creating an confirmed ride and adding it to the history -
                Ride ride = new Ride(passenger.getPickupLocation(),
                        passenger.getDropLocation(),
                        fare, "CONFIRMED", ele);
                rideHistory.add(ride);
                break;
            }
        }

        if (!assump) {
            System.out.println("INVALID USER ID");
        }

    }

    public double calculateFare(String pickup, String drop) {
        double fare = 0;
        int pickupIndex = -1;
        int dropIndex = -1;
        int indx = 0;

        for (String point : stops) {
            if (pickup.equals(point)) {
                pickupIndex = indx;
            }
            if (drop.equals(point)) {
                dropIndex = indx;
            }
            indx++;
        }

        //validation for prevent out of bounds error
        if (pickupIndex == -1 || dropIndex == -1) {
            System.out.println("Invalid pickup or drop location ");
            return 0;
        }
        // destination drop - start which is pickup location
        //like 7 - 4 = 3km they have travveled
        fare = (distances[dropIndex] - distances[pickupIndex]) * 30;
        return fare;
    }

    public void cancelRide() {
        if (currentCab == null) {
            System.out.println("no ride has been booked");
            return;
        }

        System.out.println("CANCE; A RIDE MODULE");
        System.out.println("your ride details");
        currentCab.getCabDetails();

        System.out.println("do you want to cancel your ride (YES/NO)");
        String resp = new Scanner(System.in).next();

        if (resp.equalsIgnoreCase("YES")) {
            System.out.println("your ride has been cancelled");
            //add cancelled ride to history
            Ride cancelledRide = new Ride(passenger.getPickupLocation(), passenger.getDropLocation(), 0, "CANCELLED", currentCab);
            rideHistory.add(cancelledRide);
            currentCab = null;
        }
    }

    public void rideHistory() {
        System.out.println("ride history");
        if (rideHistory.isEmpty()) {
            System.out.println("No rides found!");
            return;
        }
        for (Ride r : rideHistory) {
            r.printRide();
        }

    }
}

public class KuberDriver {

    public static void main(String[] args) {
        Uber uber = new Uber();
        uber.homeModule();
    }
}
