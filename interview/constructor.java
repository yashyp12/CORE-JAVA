public class constructor {
     
    // having same constructor but diff para sequence
    public constructor(int tyres, String model){
        System.out.println(tyres);
        System.out.println(model);
    }

    public static void raut(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        // constructor cs = new constructor();
         
        // create an object
        constructor cse = new constructor(24,"suzuki");

        cse.raut("Nikhil Bhai");
    }




}
