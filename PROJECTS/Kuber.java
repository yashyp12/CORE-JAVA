class Driver{
//gives driver details
private String name;
private Long contact;

Driver(String name,Long contact){
	this.name = name;
	this.contact = contact;
}

//getter for fetching driver details
public void getDriver(){
	System.out.println("\n Driver Info");
	System.out.println("Driver Name " + name);
	System.out.println("Contact : " + contact);
}

}


class Cab{

	static int id = 1212;
	private Driver driver;
	private String number;
	private String uberId;
	private String type;
	private int capacity;
	private String status = "AVAIL";
	private String location = "DECCAN";

	String [] typeVehicle = {"hatchback","sedan","suv","muv"};
	int [] vehicleCapacity = {3,4,5,6};

	{
		//this will give an unqieu id executes first when obj created
		this.uberId = "UBER" + id++;
	}

Cab(String number,String type,Driver driver){

	this.number = number;
	this.type = type.toLowerCase();

	int indx = 0;
	for(String element: typeVehicle){
		if(type.toLowerCase().equals(element){
			break;
		}
		indx++;
	}

	this.capacity = vehicleCapacity[indx];
	this.driver = driver;

}


public void getCabDetails(){
	System.out.println("\N CAB DETAILS");
	System.out.println("Uber Id : " + uberId);
	System.out.println("Status " + status);
	System.out.println("Type :" + type);
	System.out.println("Capacity: " + capacity);
	System.out.println("Location " + location);
	System.out.println("");
}

public String getCabNumber(){
	return number;
}

public Driver getDriver(){
	return driver;
}

public String getStatus(){
	return status;
}

public void setStatus(String newStatus){
	status = newStatus;
}

public int getCapacity(){
	return capacity;
}

public String getUberId(){
	return uberId;
}

}




class Kuber{

	public static void main(String[] args) {
		System.out.println("Welcome into Kuber");
	}
}