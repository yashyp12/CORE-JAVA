import java.util.*;
public class range {
 
    // checking range of the alpha digit or special char usign relational operator 
  
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        System.out.println(!(ch>='A' && ch<='Z' || ch >=97 && ch<=122));

        
         

    }
} 
 