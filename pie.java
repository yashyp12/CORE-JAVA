import java.util.*;

public class pie {
     // wap to find the area of circle - Area = pi * radius * radius  

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
         double pie = 3.14;
         float radius;

         
         System.out.println("enter the radius of circle");
         radius = sc.nextInt();
         double area = pie * radius * radius;
         
         System.out.println("the area of circle is "+ area);


         sc.close();
        

     }


     


    }
