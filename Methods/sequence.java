
import java.util.Scanner;

public class sequence {
 
    
    // Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
    // 1, 2, 4, 8, 16, 32, 64, ......, 1024
public static void main(String[] args) {
    System.out.println("Enter the num");
    int num = new Scanner(System.in).nextInt();

    int j =1;
    for(int i =0; i<=num;i++){
        System.out.print(j +" ");
        j = j*2;

        

    }
    

      
}


}
