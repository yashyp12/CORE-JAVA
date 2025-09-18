
import java.util.Scanner;

public class PrintNum {

    // static int counter = 1; //2 3 4
    public static void main(String[] args) {

//         Given an positive integer n, print numbers from 1 to n without using loops.
// Implement the function printTillN() to print the numbers from 1 to n as space-separated integers.
        int n = new Scanner(System.in).nextInt();
        printTillN(n);

    }

    static void printTillN(int n) { //5
        if (n <= 0) {
            return;
        }

        printTillN(n - 1);
        System.out.println(n + "");

    }
}
