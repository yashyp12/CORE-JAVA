import java.util.Scanner;

public class reversedNum {
    

    public static void main(String[] args) {
        System.out.println("enter the num");
        int num = new Scanner(System.in).nextInt();
//121
       reverString(num);
    }

    public static void reverString(int num){
        int rev = 0;
        int dup = num;
// rev = rev/10 + rem
        for(int i =1; dup>0; i++){
            int rem = dup%10;
            rev = rev*10+rem;
            dup=dup/10;
            
        }

       System.out.println("the reversed string is "+rev);


        
    }
}
