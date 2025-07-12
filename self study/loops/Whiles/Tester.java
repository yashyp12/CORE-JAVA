package loops.Whiles;

import java.util.Scanner;

public class Tester {
    
    // Sum of numbers using while Loop
    public static void main(String[] args) {
        
        System.out.println("enter the digits");
        int inputNumber = new Scanner(System.in).nextInt();
        int temp = 0;
        int sumofDigits =0;

        while (inputNumber > 0) {
            
            // it will give us the last digit if we get an reminder of the num
            temp = inputNumber%10;
            sumofDigits +=temp;
            inputNumber /= 10;


        }

        
        System.out.println("the sum of digit is " + sumofDigits);
    }
}
