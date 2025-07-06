import java.util.*;

public class even_odd {
    

    // even odd without modulas

    public static void main(String[] args) {
        
        System.out.println("enter a number");
        int num = new Scanner(System.in).nextInt();


        // // for that we need to divide the num by 2 or their quotient /2 == num then its become even otherwwise odd

        // int quotient = num/2;
        // int product = quotient * 2;

        // System.out.println((product == num) ? ("its even"):("its an odd bhai"));


        // now we will try by point like - if we divide num /2 -> quotient *2 -> if its in point then it will be odd because it quotient will be in points

        int quotient = num/2;
        double pro = quotient*2.0;

        System.out.println((pro == num) ?("its even"):("its an odd num"));









    }
}
