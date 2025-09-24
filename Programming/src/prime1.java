
import java.util.Scanner;

public class prime1 {

    // find the prime num using the 1 st method 
    /*
     * step 1 - take the num 
     * step 2 - take numinator or denominator 2 var
     * step 3 - add loop condition - denominator has to be less than numinator 
     * step 4 - if num ==1 its not prime s
     * step 5 - starts denominator iteration from 2 
     *  
     */
    public static void main(String[] args) {

//         int num = new Scanner(System.in).nextInt();
//         int den = 2;
//         if (num == 1) {
//             System.out.println("its not an prime num");
//         }
// //            2 < 10
//         while (den <=num / 2) {
//             if (num % den == 0) {
//                 break;
//             }
//             den++;
//         }
//         if (den<=num/2) {
//             System.out.println("its not an prime num");
//         } else {
//             System.out.println("its an prime num");
//         }
        int num = new Scanner(System.in).nextInt();
        int den = 2;

        if (num == 1) {
            System.out.println("its not an prime num");
            return;
        }

        while (den <= num / 2) {

            if (num % den == 0) {
                break;
            }
            den++;
        }

// condition after loop
        if (den > num / 2) {
            System.out.println("its an prime nos");
        } else {
            System.out.println("its not an prime");
        }
    }
}
