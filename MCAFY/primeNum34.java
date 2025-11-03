import java.util.Scanner;

public class primeNum34 {
    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        System.out.println(isPrime23(num));
    }

    // 23
    static boolean isPrime23(int num) {

        // if (num <= 1)
        //     return false;

        // int den = 2;

        // while (den < num / 2) {
        //     if (num % den == 0) {
        //         return false;
        //     }
        //     den++;
        // }


// another method
if(num<=1) return false;
if(num ==2) return true;
if(num %2==0) return false;

for( int i =3; i*i <=num; i++){
    if(num%i ==0) return false;
}

        return true;
    }
}
