import java.util.*;

public class Energy {
    
	 // wjp calculate energy needed to heat water from inital temp to 
    // final temp , take an amount water in kg abd intial and final temp
    // of the water.
    // formula - Q = M*(finalTemperature - initalTemperature)*4184
    // M is weight of water in kg, temp are in degree celcius and energy Q is measured in joules.


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of water in Kg");
        double amount_water = sc.nextDouble();
        
        System.out.println("enter the inital temp of Water in celcius");
        double initTemp = sc.nextDouble();
        
        System.out.println("Enter the final temp celcius");
        double finalTemp = sc.nextDouble();
        
        //Q = M*(FINALTEMP - INITIAL TEMP)*4184
        
        double energy = amount_water * (finalTemp - initTemp)*4184;
        
        System.out.println("the calculated energy is " + energy + "  joules");
        
        
        
     
    }
}
