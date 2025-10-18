
import java.util.Scanner;

public class PronicNum {



/*
 * 
 * 
 * 
 * 
 * 
 * 
 */


    public static void main(String[] args) {

        System.out.println("Enter the Num ");
        int num = new Scanner(System.in).nextInt();

        if(isPronic(num)){
            System.out.println("its a pronic Num");
        }else{
            System.out.println("its not an pronic Num");
        }
    }

    public static boolean isPronic(int num) {

        int i = 1;

        while (true) {

            if (i * i + 1 == num) {
                return true;
            } else if (i * i + 1 > num) {
                return false;
            }
            i++;
        }

    }
}
