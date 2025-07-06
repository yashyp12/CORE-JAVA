import java.util.Scanner;

import java.util.*;
public class feetToMtetre {
    
    //wjp input num in feet, converts to meters , display result , 1 foot - >0.305 meter


    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the num in feet");
        double feet = sc.nextDouble();

        double meters = feet*0.305;

        System.out.println("the given feet " + feet+" in meter is " + meters);


    }
}
