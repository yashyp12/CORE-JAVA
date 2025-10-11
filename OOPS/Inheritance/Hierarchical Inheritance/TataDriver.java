class Tata{

    String companyName  ;
    String founder  ;
    int foundedYear ; 
    String headQuarter ;

    public Tata(String companyName, String founder, int foundedYear, String headQuarter) {
        this.companyName = companyName;
        this.founder = founder;
        this.foundedYear = foundedYear;
        this.headQuarter = headQuarter;
    }

    public void companyInfo(){
        System.out.println("Company Name" + companyName);
        System.out.println("Founder" + founder);
        System.out.println("Founded Yea" + foundedYear);
        System.out.println("Head Quarter" + headQuarter);
    }
}


class TataMotors extends Tata{
    String vehicleType = "Cars";
    int revenue;
    int TopModel;

    public TataMotors(String companyName, String founder, int foundedYear, String headQuarter, String vehicleType, int revenue, int topModel) {
        super(companyName, founder, foundedYear, headQuarter);
        this.vehicleType = vehicleType;
        this.revenue = revenue;
        TopModel = topModel;
    }

    void showMotorsInfo(){
        System.out.println("Tata motors " + vehicleType);
        System.out.println("Top model " + TopModel);
        System.out.println("Total Revenue " + revenue);
    }
}


class TataTanishq extends Tata{
    String productType ;
    int varities ;
    int branches;

    public TataTanishq(String companyName, String founder, int foundedYear, String headQuarter, String productType, int varities, int branches) {
        super(companyName, founder, foundedYear, headQuarter);
        this.productType = productType;
        this.varities = varities;
        this.branches = branches;
    }

    public void showTataTanishq(){
        System.out.println("Show Tata Tanishq");
        System.out.println("Product type " + productType);
        System.out.println("Varities " + varities);
        System.out.println("Branches " + branches);
    }
}


public class TataDriver {
    public static void main(String[] args) {
        TataTanishq obj = new TataTanishq("TATA","JAMSHETHJI TATA",1968,"JAMSHEDPUR","TATA",650,658);

        obj.showTataTanishq();
        obj.companyInfo();
    }
}
