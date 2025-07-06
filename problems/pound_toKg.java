import java.util.*;

public class pound_toKg {
    

    // conversion of pounds to Kg -1 pound is 0.454 kg

    public static void main(String[] args) {
        
        System.out.println("enter the pounds ");
        double pounds = new Scanner(System.in).nextDouble();

        double kg = pounds * 0.454;

        System.out.println(pounds + " Pounds to Kg is " + kg);
    }

}
