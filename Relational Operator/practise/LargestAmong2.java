package practise;
import java.util.*;

// find the largest num among 3 using TERNARY OPEAROT
public class LargestAmong2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the num1");
        int a = sc.nextInt();
        
        System.out.println("ente the num2");
        int b = sc.nextInt();

        System.out.println("enter the num3");
        int c = sc.nextInt();

        System.out.println(

        (a>b && a>c ?"a is greater":
        (b>c ? "b is greater":
        "c is greater"))

        );

        sc.close();
    }


    

}
