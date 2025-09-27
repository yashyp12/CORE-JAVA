import java.util.Scanner;

class Driver{
    private String name;
    private Long contact;

    Driver(String name,Long contact){
        this.name = name;
        this.contact = contact;
    }

    public void getDriver(){
        System.out.println(" DRIVER INFO ");
        System.out.println("Driver : " + name);
        System.out.println("Contact : " + contact);
    }
}


class Cab{
    private Driver driver;
    static int id = 3535;
    private String uberId;
    private String number;
    private int capacity;
    private String status = "AVAIL";
    private String location = "DECCAN";
    private String type;

String [] typeVehicle = {"hatchback","sedan","suv","muv"};
int [] vehicleCapacity = {3,4,5,6};

{
    this.uberId = "UBER" + id++;

}
Cab(String number,String type){
    this.number = number;
    this.type = type.toLowerCase();

    int indx = 0;
    for(String element : typeVehicle)
    {
        if(type.toLowerCase().equals(element)){
            break;
        }
        indx++;
    }
    this.capacity = vehicleCapacity[indx];

    System.out.println("Enter the driver details ");
    System.out.println("Enter a name :");
    String name = new Scanner(System.in).nextLine();
    System.out.println("Enter the contact ");
    Long contact = new Scanner(System.in).nextLong();
    this.driver = new Driver(name, contact);

}

public void getCabDetails(){
    System.out.println("CAB DETAILS ");
    System.out.println("Uber Id : " + uberId);
    System.out.println("Status: "+ status);
    System.out.println("Cab Number "+ number);
        
}
}



class UberDriver{
    
    public static void main(String[] args) {
        System.out.println("WELCOME ");
        System.out.println("Enter the cab number  ");
        String cabNumber = new Scanner(System.in).next();
        System.out.println("Type of Cab");
        String type = new Scanner(System.in).next();
        Cab cab1 = new Cab(cabNumber, type);
        cab1.getCabDetails();

    }
}