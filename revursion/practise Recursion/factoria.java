
import java.util.Scanner;

public class factoria {

    static int sum = 1; // 4
    static int counter = 0;

    public static void main(String[] args) {

        System.out.println("enter the num ");
        int num = new Scanner(System.in).nextInt();
        // int facto = factoria(num);
        System.out.println("the factorial of " + num + "is " + sum);
    }

    static void factoria(int num) { // 4   3 2 1

        // //base condition 
        // if (num == 1) {
        //     return 1;
        // }
        // // counter intialised
        // ++counter; //1 2  3
        // System.out.println("function has been started " + counter);
        // sum *= num; // 4  12  24
        // return factoria(num - 1);
        // facto using head recursion 
        //base condition 
        if (num == 1) {
            return;
        }
        factoria(num - 1);

        sum *= num; // 4  12  24

    }

}
