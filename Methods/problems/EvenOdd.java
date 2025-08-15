
import java.util.Scanner;

public class EvenOdd {
    static int num;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        num = sc.nextInt();

        EvenOdd(num);

    }

    public static void EvenOdd(int n){
        if(n%2==0){
            System.out.println("num is even");
        }else{
            System.out.println("odd");
        }


    }
}
