
import java.util.Scanner;

public class praact3 {
    // Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

// Note: Only one of the three v

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1,num2,num3;
    System.out.println("Enter the num1");
    num1 = sc.nextInt();

    System.out.println("Enter the num2");
    num2 = sc.nextInt();

    System.out.println("Enter the num3");
    num3 = sc.nextInt();

  
    
    if(num1 ==7 ){
System.out.println("one of the num is 7 calculating right side ");
        int result = num2*num3;
System.out.println(result);
    }else if(num2 ==7){
        
        System.out.println(num3);
    }else if(num3==7){
        int result = -1;
        System.out.println(result);
    }else if(num1<0 || num2<0 || num3 <0){
        System.out.println("num is negative");
    }else{
        int result = num1*num2*num3;
        System.out.println("product of num is " + result);
    }


}
}
