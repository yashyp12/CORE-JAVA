import java.util.Scanner;

public class intornot {
    // check whethertheinput is int or not 
public static void main(String[] args) {
    
    System.out.println("enter your number");
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.hasNextInt());

    sc.close();
}
}
