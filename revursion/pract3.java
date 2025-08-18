
import java.util.Scanner;

public class pract3 {

    static int count = 0;//1 //2
    static int factorial = 1; // 3

    public static void main(String[] args) {

        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
        int demo = fact(num);
        System.out.println("factorial is " + demo);

    }

    static int fact(int num) { //3 //2 //1

        
        if (num <= 1) {
            return 1;
        }

        ++count;
        System.out.println("hey method starts " + count);
        factorial *= num; //3 //3*2=6 // 

        System.out.println("hey method ends" + num);
        fact(num - 1); // fact(2) // fact(1)
        return factorial;
    }
}
