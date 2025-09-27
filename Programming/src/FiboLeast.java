
import java.util.Scanner;

// How many least (smallest number) to be added or subtracted from the given number so that it becomes a Fibonacci number?
public class FiboLeast {

    public static void main(String[] args) {
        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        //n2 is above num or holds current fibo num thats why, check whether its smaller than num or not if yes then generate next fibonacii series
        while (n2 < num) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        int aboveNum = n2 - num;
        int belownum = num - n1;

//now fetch the minimum val from both above below
        int Results = Math.min(aboveNum, belownum);
        
        if (aboveNum == 0 || belownum == 0) {
            System.out.println("num is already fibonacii num");
        } else if (Results == aboveNum) {
            System.out.println("the " + aboveNum + " needs to add in num");
        } else {
            System.out.println(belownum + " substract from the num");
        }

    }

}
