
import java.util.Scanner;

public class factorial {

    static double fac = 1;
    static int a = 0;

    public static void main(String[] args) {

        // factorial using recursion 5! = 5*4*3*2*1 = 
        // in recursion 5! * 4!;
        System.out.println("enter the num");
        int num = new Scanner(System.in).nextInt();
        double op = fact(num);

        System.out.println("last termination pritning output");
        System.out.println(op);
    }

    static double fact(int num) {

//base condition
        if (num == 1) {
            System.out.println("base condition satisfied return 1");
            return 1;
        }

        System.out.println("iteration no " + ++a);
        fac = (num * fact(num - 1));// 

        return fac;
    }
}
