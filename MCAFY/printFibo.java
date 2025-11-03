import java.util.Scanner;

public class printFibo {
    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();

        if (num < 0) {
            System.out.println("nt an fibo");
            return;
        }

        int n1 = 0;
        int n2 = 1;
        int n3;


        if(num ==0 || num ==1){
            System.out.println("its an fibo");
            return;
        }

        while(n1<num){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }

        if(n1 == num){
            System.out.println("its an fibo");
        }else{
            System.out.println("not an fibo");
        }


    }
}
