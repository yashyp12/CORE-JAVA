import java.util.*;


public class vowels_range {
    
    // checking for ranges for vowels ->converting them into the uppercase during the user input 

    public static void main(String[] args) {
        System.out.println("enter a character");

        char ch = new Scanner(System.in).next().toUpperCase().charAt(0);

        System.out.println(ch=='A' || ch =='E' || ch == 'I' || ch =='O' || ch =='U');

    }
}
