import java.util.Scanner;

public class LargestNum {
    

    // finding the largest num amoong 2

    public static void main(String[] args) {
        
        System.out.println("enter the num1 ");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("enter the num2");
        int num2 = new Scanner(System.in).nextInt();

        System.out.println((num1<num2)?("num2 is larger"):("num1 is larger"));
    }

}
