import java.util.Scanner;

public class spynum {


    public static void main(String[] args) {
        
        // num = 22 - if sum of both is 2+2 = 4, and addition both - 2*2 = 4 , then its an spy num

        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();

        
        int sum = num+num;
        int product = num*num;

        if(sum == product){
            System.out.println("the number is Spy ");

        }
        else{
            System.out.println("the number is not Spy");
        }
     
    }
}
