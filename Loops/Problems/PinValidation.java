
import java.util.*;

public class PinValidation {

    public static void main(String[] args) throws InterruptedException {

        int storedPin = 123;
        int attempt = 3;
		int duration = 5000;

        outerloop: //this is an label
        for (;;) {

            do {

                System.out.println("Enter the pin");
                int userPin = new Scanner(System.in).nextInt();

                if (userPin == storedPin) {
                    System.out.println("Phone has been unlocked !");
                    break outerloop;
                } else {
                    System.out.println("Invalid pin Try again!!");
                    System.out.println("attemp remaining " + (attempt - 1));

                }

                attempt--;
				
            } while (attempt != 0);
			duration*=2;
			System.out.println("you need to wait for " + (duration/1000) + " seconds");
			Thread.sleep(duration);
			attempt = 3;


			 
        }

    }
}
