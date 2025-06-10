import java.util.*;

public class kmtomiles {
    public static void main(String[] args) {
        // converting the km into the miles 
        System.out.println("Enter the km");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        // formula of conversio of km to miels are dividing the 1 * 1.609 = miles 
        double  miles = km /1.609;
        
        System.out.println("miles are  " + miles);
        

    }
}
