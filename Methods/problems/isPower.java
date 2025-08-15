
import java.util.Scanner;

public class isPower {

    public static void main(String[] args) {

        //power of number
        System.out.println("Enter the base num");
        int base = new Scanner(System.in).nextInt();

        System.out.println("Enter the power");
        int power = new Scanner(System.in).nextInt();

        isPower(base, power);
    }

    public static void isPower(int base, int power) {
        int fpower = 1;
        
        while(power>0){
            fpower *=base;
            power --;
        }
        System.out.println("power of " + base + " is " + fpower);
    }
}
