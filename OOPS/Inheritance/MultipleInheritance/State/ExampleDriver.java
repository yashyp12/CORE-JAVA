package Inheritance.MultipleInheritance.State;

class Country {

    String name;
    String capital;
    String language;
    String pm;
    double area;
    Long population;
    char currency;

    public Country(String name, String capital, String language, String pm, double area, Long population, char currency) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.pm = pm;
        this.area = area;
        this.population = population;
        this.currency = currency;
    }

    public void getCountry() {
        System.out.println("COUNTRY NAME " + name);
        System.out.println("capital " + capital);
        System.out.println("Language " + language);
        System.out.println("Pm  " + pm);
        System.out.println("Area  " + area);
        System.out.println("Population  " + population);
        System.out.println("Currency " + currency);
    }

}

class State extends Country {

    String State_Name;
    String State_capital;
    String cm;
    String State_language;
    int districts;
    Long population;
    double area;

    public State(String name, String capital, String language, String pm, double area, Long population, char currency,
                 String state_Name, String State_capital, String cm, String language1, int districts, Long population1, double area1) {
        super(name, capital, language, pm, area, population, currency);
        State_Name = state_Name;
        this.State_capital = State_capital;
        this.cm = cm;
        this.State_language = language1;
        this.districts = districts;
        this.population = population1;
        this.area = area1;
    }

    public void getState() {
        System.out.println("Name is " + State_Name);
        System.out.println("State Capital " + State_capital);
        System.out.println("CM " + cm);
        System.out.println("State Language " + language);
        System.out.println("State districts " + districts);
        System.out.println("Statte Population " + population);
        System.out.println("Area " + area);
    }
}

class District extends State {

    String Dis_name;
    String MuncComm;
    Long Dis_Population;
    double Dis_area;

    public District(String name, String capital, String language, String pm, double area, Long population, char currency,
                    String state_Name, String State_capital, String cm, String language1, int districts, Long population1, double area1,
                    String dis_name, String MuncComm, Long dis_Population, double dis_area) {
        super(name, capital, language, pm, area, population, currency, state_Name, State_capital, cm, language1, districts, population1, area1);
        Dis_name = dis_name;
        this.MuncComm = MuncComm;
        Dis_Population = dis_Population;
        Dis_area = dis_area;
    }

    public void getDistrict() {
        System.out.println("*******************");
        getCountry();
        System.out.println("*********************");
        getState();
        System.out.println("*****************************");
        System.out.println("DISTRICT INFO");
        System.out.println("NAME " + Dis_name);
        System.out.println("MUNC " + MuncComm);
        System.out.println("POPULATION " + Dis_Population);
        System.out.println("DIS AREA " + Dis_area);
        System.out.println("STATE DETAILS");

    }

    public void setDistrict(String dis_name, String MuncComm, Long dis_Population, double dis_area) {
        Dis_name = dis_name;
        this.MuncComm = MuncComm;
        Dis_Population = dis_Population;
        Dis_area = dis_area;
    }
}

public class ExampleDriver {

    public static void main(String[] args) {

        // country
// String name, String capital, String language, String pm, double area, Long population, char currency,
// state
//  String state_Name, String State_capital, String cm, String language1, int districts, Long population1, double area1,
// district
// String dis_name, String MuncComm, Long dis_Population, double dis_area
        District obj = new District("INDIA", "NEW DELHI", "HINDI", "MODI", 328765, 14286000000L, '₹',
                "MAHARASHTRA", "MUMBAI", "EKNATH SHINDE", "MARATHI", 36, 124000000L, 307713,
                "JALGAON", "JMC", 4600000L, 11765);
        obj.getDistrict();

    }
}
