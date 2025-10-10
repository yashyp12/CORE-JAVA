class Tata{

    String companyName  ;
    String founder  ;
    int foundedYear ; 
    String headQuarter ;

    public Tata() {
        
    }

    

    void companyInfo(){
        System.out.println("Company Name" + companyName);
        System.out.println("Founder" + founder);
    }
}


class TataMotors extends Tata{
    String vehicleType = "Cars";

    void showMotorsInfo(){
        System.out.println("Tata motors " + vehicleType);
    }
}


class TataTanishq extends Tata{
    String productType = "Jwellery";

}


public class TataDriver {
    public static void main(String[] args) {
        
    }
}
