
import java.util.Scanner;

public class power1 {

// power number base-4 , power 3
    public static void main(String[] args) {

        int base = new Scanner(System.in).nextInt();
        int power = new Scanner(System.in).nextInt();
        int op = 1;
        for (int i = 1; i <= power; i++) {
            op = op * base;
            // 1 *2 = 2
            // 

        }

        System.out.println("the power of  is " + base + "is " + op);
    }
}
