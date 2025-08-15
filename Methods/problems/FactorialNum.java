
import java.util.Scanner;

public class FactorialNum {

    public static void main(String[] args) {

        System.out.println("Enter the num");
        int num = new Scanner(System.in).nextInt();

        FactNum(num);
    }

    public static void FactNum(int num) {
        int store = 1;
        int dup = num;
        while (num > 0) {
            store *= num;
            num--;
        }
        System.out.println("factorial of " + dup + " is " + store);
    }
}
