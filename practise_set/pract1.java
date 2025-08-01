import java.util.Scanner;

public class pract1 {
    

    // Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
    // samp inp - 6,5 --> 22  , 5 5 --> 10
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the num1");
    int num1  = sc.nextInt();
    System.out.println("Enter the num2");
    int num2 = sc.nextInt();

    if(num1 == num2){
        System.out.println("the both num is same");
        System.out.println(num1+num2);
    }
    else{
        System.out.println("the num are not same");
        System.out.println((num1+num2)*2);
    }

     
}

}
