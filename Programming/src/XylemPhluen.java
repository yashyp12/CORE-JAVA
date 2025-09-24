
import java.util.Scanner;

public class XylemPhluen {

    //water and food - biology concept
    public static void main(String[] args) {
//stpe 1 - take large digit and
        /*
        we want tochekc whether the addition of last digit  = middle digit
        if yes then its xylem othervise its phenem
step 1 -
         */

        int num = new Scanner(System.in).nextInt();

        int sumOfEnd = num % 10;
        num /= 10;
        int sumOfMiddle = 0;

        while (num > 9) {
            sumOfMiddle += (num % 10);
            num /= 10;
        }

        sumOfEnd += num;

        if (sumOfEnd == sumOfMiddle) {
            System.out.println("number is xylem");
        } else {
            System.out.println("it is phloem num");
        }

    }
}
